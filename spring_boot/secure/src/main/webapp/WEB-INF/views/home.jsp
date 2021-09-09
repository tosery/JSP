<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<sec:authorize access="isAnonymous()">
<a href="customLogin">로그인</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
<a href="customLogin">로그아웃</a>
</sec:authorize>
</body>
</html>
