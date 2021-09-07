package com.jun.controller;

import java.io.IOException;
import java.sql.Date;
//import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jun.domain.MemberDAO;
import com.jun.domain.MemberVO;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberDAO memberDAO;

	public void init() throws ServletException {
		memberDAO = new MemberDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = null;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getPathInfo();// URL에서 요청명을 가져옵니다. 매우중요
		String command = request.getParameter("command");
		System.out.println("action:" + action);
		if (action == null || action.equals("/listMembers.do")) {
			List<MemberVO> membersList = memberDAO.listMembers();// MemberDAO의 listMembers()에 있는 List<MemberVO>
																	// membersList를 불러온다.
			request.setAttribute("membersList", membersList);
			nextPage = "/listMembers.jsp";// listMembers.jsp를 실행시킨다.
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} else if (action.equals("/addMember.do")) {
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			String gender = request.getParameter("gender");
			String email = request.getParameter("email");
			String recv_email = request.getParameter("recv_email");
			MemberVO memberVO = new MemberVO(id, passwd, name, birthday, gender, email, recv_email);
			memberDAO.addMember(memberVO);

			Date currentDatetime = new Date(System.currentTimeMillis());
			java.sql.Date sqlDate = new java.sql.Date(currentDatetime.getTime());
			java.sql.Timestamp regDate = new java.sql.Timestamp(currentDatetime.getTime());
//			request.setAttribute("msg","1");//listMembers.jsp에 있습니다.

			nextPage = "/Economics.jsp?msg=2";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} else if (action.equals("/memberForm.do")) {
			nextPage = "/join.jsp";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} 
		else if (action.equals("/login.do")) 
		{
			HttpSession session = request.getSession();
			System.out.println("세션 아이디: " + session.getId() + "<br>");
//			MemberVO memberVO = memberService.getMemberById(id);
			nextPage = "/processLoginMember.jsp";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} 
		else if (action.equals("/result.do")) 
		{
			HttpSession session = request.getSession();
			System.out.println("세션 아이디: " + session.getId() + "<br>");
			nextPage = "/board/listArticles.do?msg=2";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} 
		else if(action.equals("/error.do"))
		{
			HttpSession session = request.getSession();
			System.out.println("세션 아이디: " + session.getId() + "<br>");
			nextPage = "/login.jsp?error";
		}
		else if (action.equals("/modMemberForm.do")) {
			String id = request.getParameter("id");
			MemberVO memInfo = memberDAO.findMember(id);
			request.setAttribute("memInfo", memInfo);
			nextPage = "/modMemberForm.jsp";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} else if (action.equals("/modMember.do")) {
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			MemberVO memberVO = new MemberVO(id, passwd, name, email);
			memberDAO.modMember(memberVO);
			request.setAttribute("msg", "modified");
			nextPage = "/member/listMembers.do";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;
		} else if (action.equals("/delMember.do")) {
			String id = request.getParameter("id");
			memberDAO.delMember(id);
			request.setAttribute("msg", "deleted");
			nextPage = "/member/listMembers.do";
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
			return;

		} else {
			System.out.println("else 사용됨...");
			List<MemberVO> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage = "/Economics.jsp";
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
}