<%@ page import="java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    Connection dbconn=DriverManager.getConnection(url, "junyeong","oracle");
    Statement stmt = dbconn.createStatement();
    ResultSet myResultSet=stmt.executeQuery("SELECT*FROM Book");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** BOOK LIST **</title>
</head>
<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<table border ="1" cellspacing="0" width="400" bordercolor="#9AD2F7"
		bordercolordark="white" bordercolorlight="#B9E0FA">
	<tr>
		<td width="150" height="20" bgcolor="#D2E9F9">
			<p align = "center">
			<span style="font-size:8pt;"><b>BOOKID</b></span>
			</p>
		</td>
		<td width="150" height="20" bgcolor="#D2E9F9">
			<p align = "center">
			<span style="font-size:8pt;"><b>BOOKNAME</b></span>
			</p>
		</td>
		<td width="150" height="20" bgcolor="#D2E9F9">
			<p align = "center">
			<span style="font-size:8pt;"><b>PUBLISHER</b></span>
			</p>
		</td>
		<td width="50" height="20" bgcolor="#D2E9F9">
			<p align = "center">
			<span style="font-size:8pt;"><b>PRICE</b></span>
			</p>
		</td>
	</tr>
<%
if(myResultSet != null){
	while(myResultSet.next()){
		String W_BOOKID=myResultSet.getString("bookid");
		String W_BOOKNAME=myResultSet.getString("bookname");
		String W_PUBLISHER=myResultSet.getString("publisher");
		String W_PRICE=myResultSet.getString("price");
	

%>
	<tr>
		<td width="150" height="20">
			<p align="center"><span style="font-size:9pt;">
			<a href="bookview.jsp?bookid=<%=W_BOOKID%>">
			<font face="맑은고딕" color = "black">
			<%=W_BOOKID%></font></a></span></p>
		
		</td>
		<td width="150" height="20">
			<p><span style="font-size:9pt;">
		
			<font face="맑은고딕" color = "black">
			<%=W_BOOKNAME%></font></span></p>
		</td>
		<td width="150" height="20">
			<p align = "center"><span style="font-size:9pt;">
			<font face="맑은고딕"><%=W_PUBLISHER%></font></span></p>
		</td>
		<td width="150" height="20">
			<p align = "center"><span style="font-size:9pt;">
			<font face="맑은고딕"><%=W_PRICE%></font></span></p>
		</td>
	</tr>
<%
	}
}
stmt.close();
dbconn.close();
%>
</table>
<table cellpadding="0" cellspacing="0" width="400" height="23">
	<tr>
		<td width="1350">
			<p align = "right"><b><a href="booklist.jsp">
			<font size="1" face="맑은고딕" color="black">LIST</font></a></b></p>
		</td>
	</tr>
</table>

</body>
</html>