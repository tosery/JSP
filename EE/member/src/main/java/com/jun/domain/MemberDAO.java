package com.jun.domain;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/*
 * DataSource 사용합니다. server의 context.xml에 정의됨
 */
public class MemberDAO {
	private static MemberDAO instance;
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static MemberDAO getInstance() {
		if(instance == null) {
			instance = new MemberDAO();
		}
			return instance;
	}

	public List<MemberVO> listMembers() {//MemberDAO의 listMembers()에 있는 List<MemberVO> membersList
		List<MemberVO> membersList = new ArrayList<MemberVO>();
		try {
			conn = dataFactory.getConnection();
			String query = "select * from  member order by regDate desc";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				String birthday = rs.getString("birthday");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String recv_email = rs.getString("recv_email");
				Date regDate = rs.getDate("regDate");
				MemberVO memberVO = new MemberVO(id, passwd, name, birthday, gender, email, recv_email, regDate);
				membersList.add(memberVO);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return membersList;
	}

	public void addMember(MemberVO m) {
		try {
			conn = dataFactory.getConnection();
			String id = m.getId();
			String passwd = m.getPasswd();
			String name = m.getName();
			String birthday = m.getBirthday();
			String gender = m.getGender();
			String email = m.getEmail();
			String recv_email = m.getRecv_email();
			
			String query = "INSERT INTO member";
			query += " (id, passwd, name, birthday, gender, email, recv_email)";
			query += " VALUES(?, ? ,? ,?, ?, ?, ?)";
			System.out.println("prepareStatement: " + query);
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.setString(4, birthday);
			pstmt.setString(5, gender);
			pstmt.setString(6, email);
			pstmt.setString(7, recv_email);
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public MemberVO findMember(String _id) {
		MemberVO memInfo = null;
		try {
			conn = dataFactory.getConnection();
			String query = "select * from  member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			System.out.println(query);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String id = rs.getString("id");
			String passwd = rs.getString("passwd");
			String name = rs.getString("name");
			String birthday = rs.getString("birthday");
			String gender = rs.getString("gender");
			String email = rs.getString("email");
			String recv_email = rs.getString("recv_email");
			Date regDate = rs.getDate("regDate");
			memInfo = new MemberVO(id, passwd, name, birthday, gender, email, recv_email, regDate);
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memInfo;
	}

	public void modMember(MemberVO memberVO) {
		String id = memberVO.getId();
		String pwd = memberVO.getPasswd();
		String name = memberVO.getName();
		String email = memberVO.getEmail();
		try {
			conn = dataFactory.getConnection();
			String query = "update member set pwd=?,name=?,email=?  where id=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pwd);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delMember(String id) {
		try {
			conn = dataFactory.getConnection();
			String query = "delete from member where id=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getLoginNameById(String id) {
			ResultSet rs = null;
		try {
			conn = dataFactory.getConnection();
			String name=null;
			String query = "select * from member where id = ? ";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.executeQuery();
//			conn = DBConnection.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			rs = pstmt.executeQuery();
//
			if (rs.next()) 
				name = rs.getString("name");	
				System.out.println(name);
			return name;
		} catch (Exception ex) {
			System.out.println("로그인네임 에러 : " + ex);
		} finally {
			try {				
				if (rs != null) 
					rs.close();							
				if (pstmt != null) 
					pstmt.close();				
				if (conn != null) 
					conn.close();
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}
		return null;
	}

}
