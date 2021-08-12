<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="db.beans.*, java.sql.*, java.util.*, java.io.*, java.text.SimpleDateFormat, java.util.Date"  %>
<%-- <%@ page import = "db.beans.QueryBean" %> --%>
<%-- <%@ page import = "db.beans.DBConnection" %> --%>
<%-- <%@ page import = "db.beans.FileInfo" %> --%>
<%@ page import = "com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import = "com.oreilly.servlet.MultipartRequest" %>
<%-- <jsp:useBean id="QueryBean" scope="page" class="db.beans.QueryBean" /> --%>
<%-- <jsp:setProperty name="QueryBean" property="*"--%>
<%
	request.setCharacterEncoding("utf-8");

	String contentType = request.getContentType();
	
	if((contentType == null) || (contentType.indexOf("multipart/form-data") == -1))
		throw new Exception("ContentType is Not multipart/form-data");
	
	String uploadDir = getServletContext().getRealPath("/") + "upload";
	
	out.println("업로드 서버 경로 -> "+uploadDir);
	
	int maxSize = 100* 1024 *1024;
	
	MultipartRequest mRequest = new MultipartRequest(request, uploadDir, maxSize,"utf-8",
			new DefaultFileRenamePolicy());
	String imgText = mRequest.getParameter("imgText");
	String fileName = mRequest.getOriginalFileName("file1");
	long filesize = mRequest.getFile("file1").length();
	
	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd__HHmmss", Locale.KOREA);
	Date currentTime = new Date();
	String dTime = formatter.format(currentTime);
	
	String[] f_name_arr = fileName.split("\\.");
	String f_end = f_name_arr[1];
	
	String strOldFile = uploadDir + "\\" + fileName;
	String strNewFile = uploadDir + "\\" + dTime + "." + f_end;
	
	File oldFile = new File(strOldFile);
	File newFile = new File(strNewFile);
	
	try{
		if(newFile.exists())
		{
			newFile.delete();
		}
		oldFile.renameTo(newFile);
	}catch(Exception e){
		out.println(e.toString());
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Image File Upload</title>
</head>
<body>
	<div id="div_popup" style = "position:absolute; left:0px; top:20px; width:500px">
		<table align="center" border="0" width="500" cellpadding="0" cellspacing="1">
			<tr height="40">
				<td colspan = "3" align = "center"><b>Upload Result</b>
				</td>
			</tr>
			<tr heigh="70">
				<td width="500" colspan="2" align = "center"><%=fileName %>==><br>
				<%=strNewFile %><br>(<%=fileSize%>byte) 파일을 서버에 업로드 하였습니다.
				</td>
			</tr>
			<tr height="35">
				<td width="400"> &nbsp;</td>
				<td width="100"> <input type="button" value="O K" onClick="javascript:window.close();"></td>
			</tr>
		</table>
</body>
</html>