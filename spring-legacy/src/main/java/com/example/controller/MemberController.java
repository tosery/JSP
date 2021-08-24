package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;


@Controller
@RequestMapping("/member/*")
public class MemberController {

	@GetMapping("/join") // /member/join
	public String join() {
		System.out.println("join 호출됨...");
		return "member/join";
	}
	
	
	@PostMapping("/join")
	public void join(MemberVO memberVO) {
		
		System.out.println(memberVO);
	}
	
	
}






