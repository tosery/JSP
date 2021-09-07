package com.jun.domain;

import java.sql.Date;

public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String birthday;
	private String gender;
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", birthday=" + birthday + ", gender="
				+ gender + ", email=" + email + ", recv_email=" + recv_email + ", regDate=" + regDate + "]";
	}

	private String email;
	private String recv_email;
	private Date regDate;
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}
	
	

	public MemberVO(String id, String passwd, String name, String email) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
	}


//전체에서 regDate만 빼고 시작(7개)
	public MemberVO(String id, String passwd, String name, String birthday, String gender, String email, String recv_email) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.recv_email = recv_email;
		
	}//전체에서 regDate만 빼고 끝
	
//전체 생성자 시작(8개)
	public MemberVO(String id, String passwd, String name, String birthday, String gender, String email, String recv_email, Date regDate) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.recv_email = recv_email;
		this.regDate = regDate;
	}//전체 생성자 끝



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getRecv_email() {
		return recv_email;
	}



	public void setRecv_email(String recv_email) {
		this.recv_email = recv_email;
	}



	public Date getRegDate() {
		return regDate;
	}



	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}




	
}
