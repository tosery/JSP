<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String birthday = request.getParameter("birthday");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	String recv_email = request.getParameter("recv_email");

	Date currentDatetime = new Date(System.currentTimeMillis());
	java.sql.Date sqlDate = new java.sql.Date(currentDatetime.getTime());
	java.sql.Timestamp regDate = new java.sql.Timestamp(currentDatetime.getTime());
%>

<sql:setDataSource var="dataSource"
	url= "jdbc:oracle:thin:@localhost:1521:xe"
	driver="oracle.jdbc.driver.OracleDriver" user="scott" password="oracle" />

<sql:update dataSource="${dataSource}" var="resultSet">
   INSERT INTO member VALUES (?, ?, ?, ?, ?, ?, ?, ?)
   <sql:param value="<%=id%>" />
	<sql:param value="<%=passwd%>" />
	<sql:param value="<%=name%>" />
	<sql:param value="<%=birthday%>" />
	<sql:param value="<%=gender%>" />
	<sql:param value="<%=email%>" />
	<sql:param value="<%=recv_email%>" />
	<sql:param value="<%=regDate%>" />
</sql:update>

<c:if test="${resultSet>=1}">
	<c:redirect url="/Economics.jsp?msg=1" />
</c:if>

