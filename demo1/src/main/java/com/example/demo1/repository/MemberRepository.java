package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.JapMember;

public interface MemberRepository extends JpaRepository<JapMember, Long>{
	
}
