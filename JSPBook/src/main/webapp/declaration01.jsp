<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tag</title>
</head>
<%
	int count = 0;
%>
<body>
	<%! int data = 50; 
		int sum(int a, int b){
			return a + b;
		}
	%>
	
	<%
		out.println("Value of the variable is:" + data + "<br>");
		out.println("2 + 3 = " + sum(2,3) + "<br>");
		for(int i = 0; i<=10; i++)
		{
			if(i%2==0){ out.println(i+"<br>");}
				
		}
	%>
	<%-- 이것은 주석 웹브라우저에서 안보인다. --%>
	Page Count is
	<%= ++count %>
	<p> Today's date: <%= new java.util.Date() %></p>
	
	<%
		int a = 10;
		int b = 20;
		int c = 30;
	%>
	
	<%= a + b + c%>
	
</body>
</html>