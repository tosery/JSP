<%@ page import="java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <a href = ></a>
 <%
 	Class.forName("oracle.jdbc.driver.OracleDriver");
 	String url="jdbc:oracle:thin:@localhost:1521:XE";
 	
 	Connection dbconn=DriverManager.getConnection(url, "junyeong", "oracle");
 	Statement stmt = dbconn.createStatement();
// 	String bookid=request.getParameter("bookid");//이놈이 booklist에서 넘어오는(request객체로)
 	//request 파라메타 ?bookid로 넘어오면 
 	ResultSet myResultSet;
 	
 	String bookid = (request.getParameter("bookid") == null) ? null : request.getParameter("bookid");
 	
	myResultSet = stmt.executeQuery("SELECT * FROM Book WHERE BOOKID= '"+bookid+"'");
	if(myResultSet !=null){
	myResultSet.next();
	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** BOOK VIEW **</title>
</head>
<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
	<table border ="1" cellspacing="0" width="400" bordercolor="#9AD2F7"
	bordercolordark="white" bordercolorlight="#B9E0FA">
	<tr>
	<td width ="150" height="23">
		<p align="center">
		<span style="font-size:9pt ;">책 제 목</span></p>
	</td>
	<td width="513">
		<p><span style="font-size:9pt;">
		<%=myResultSet.getString("BOOKNAME")%></span></p>
	</td>
	</tr>
	<tr>
	<td width ="150" height="23">
		<p align = "center">
		<span style="font-size:9pt ;">출 판 사</span></p></td>
	<td width="513">
	<p><span style="font-size:9pt;">
	<%=myResultSet.getString("PUBLISHER")%></span></p>
	</td>
	</tr>
	
	<tr>
	<td width ="150" height="23">
		<p align="center">
		<span style="font-size:9pt ;">가 격</span></p>
	</td>
	<td width ="513">
		<p><span style="font-size:9pt;">
		<%=myResultSet.getString("PRICE")%></span></p>
	</td>

</table>
<table cellpadding="0" cellspacing="0" width="400" height="23">
	<tr>
		<td width="150">
			<p align="right"><span style="font-size:9pt;">
			<a href="booklist.jsp?">
			<font color="black">목록</font></a></span></p>
		</td>
	</tr>
</table>
<%
}
stmt.close();
dbconn.close();
%>	
</body>
</html>