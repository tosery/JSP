<%@ page import="java.sql.*"%> 
<%
	Connection conn = null;	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "junyeong";
		String password = "oracle";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		
	} catch (SQLException ex) {
		out.println("DB success!<br>");
		out.println("SQLException: " + ex.getMessage());
	}
		
%>