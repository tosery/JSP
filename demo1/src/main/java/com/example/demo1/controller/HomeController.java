package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo1.model.JapMember;
import com.example.demo1.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("join")
	public String join() {
		return "insert";
	}
	
	@PostMapping("join")
	public String join(JapMember member) {
		memberService.save(member);
		return "redirect:list";
	}
	@GetMapping("list")
	public String list(Model model) {
		List<JapMember> lists = memberService.list();
		model.addAttribute("lists", lists);
		return "list";
	}
	
	@GetMapping("detail/{id}")
	public String detail(@PathVariable Long id, Model model) {
		model.addAttribute("member", memberService.detail(id));
		return "detail";
	}
	
	@DeleteMapping("delete/{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		memberService.delete(id);
		return "success";
	}
	//수정폼
	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("member", memberService.detail(id));
		return "update";
	}
	

	@PutMapping("update")
	public String update(@RequestBody JapMember member) {
		System.out.println("addr:" + member.getAddr());
		System.out.println("email:" + member.getEmail());
		System.out.println("memo:" + member.getMemo());
		System.out.println("id:" + member.getId());
		return "success";
	}
	
}
