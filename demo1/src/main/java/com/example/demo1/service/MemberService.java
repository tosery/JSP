package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.JapMember;
import com.example.demo1.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	
	//추가
	public void save(JapMember member) {
		memberRepository.save(member);
	}
	
	//전체보기
	public List<JapMember> list(){
		return memberRepository.findAll();
	}
	//상세보기 (Optional) null값 처리
	public JapMember detail(Long id) {
		return memberRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		memberRepository.deleteById(id);
	}
}
