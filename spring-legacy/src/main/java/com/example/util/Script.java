package com.example.util;

public class Script {

	public static String href(String alertMessage, String locationPath) {
		//sb.setLength(0);//StringBuilder 현재 내용 비우기
		StringBuilder sb = new StringBuilder();
		sb.append("<script>");
		sb.append("alert('" + alertMessage + "');");
		sb.append("location.href = '" + locationPath + "';");
		sb.append("</script>");
		
		return sb.toString();
	}
	
	public static String back(String alertMessage) {
		StringBuilder sb = new StringBuilder();
		sb.setLength(0);//StringBuilder 현재 내용 비우기 만약 버퍼를 안지우면?
		
		sb.append("<script>");
		sb.append("alert('" + alertMessage + "');");
		sb.append("history.back();");//뒤로가기
		sb.append("</script>");
		
		return sb.toString();
	}
}
