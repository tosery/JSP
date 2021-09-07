<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String msg = request.getParameter("msg");
	
	if (msg != null) {
		if (msg.equals("2")) {
			String loginId = (String) session.getAttribute("sessionId");
			out.println(loginId + "님 환영합니다</h2>");
		}
	} else {
%>
		<a href="/login.jsp" class="mx-2">로그인</a> | 
    	<a href="/join.jsp" class="mx-2">회원가입</a>
<% 
	}
%>
    
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container">

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
			<c:if test="${ not empty sessionScope.id }"><%-- 로그인 했을때 --%>
				<li class="nav-item dropdown">
	              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	                내정보 관리
	              </a>
	              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	                <a class="dropdown-item" href="/member/passwd">비밀번호 변경</a>
	                <a class="dropdown-item" href="/member/modify">내정보 수정</a>
	                <div class="dropdown-divider"></div>
	                <a class="dropdown-item" href="/member/remove">회원탈퇴</a>
	              </div>
	            </li>
			</c:if>

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                게시판
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="/board/list">게시판</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">갤러리</a>
              </div>
            </li>

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                채팅 서비스
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">심플 채팅</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">채팅방 목록</a>
              </div>
            </li>

            <li class="nav-item">
              <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="검색" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
          </form>
        </div>
      </div>
    </nav>
    <!-- end of Navbar -->
    