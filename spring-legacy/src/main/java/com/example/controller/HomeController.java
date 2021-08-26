package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping(value = { "/", "/index" })
	public String home() {
		// GET 요청
		// http://localhost:8090/
		System.out.println("home() 호출됨...");
		
		return "index"; // 실행할 jsp 뷰 이름을 리턴함
	}
	
	
}

















