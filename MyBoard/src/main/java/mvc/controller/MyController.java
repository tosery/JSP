package mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends HttpServlet{
	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Get 방식으로 전송되는 요청 처리
	}
	
	@Override
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Get 방식으로 전송되는 요청 처리
	}
	
}

