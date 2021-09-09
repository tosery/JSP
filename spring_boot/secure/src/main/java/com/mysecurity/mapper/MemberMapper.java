package com.mysecurity.mapper;

import com.mysecurity.dto.MemberDTO;

public interface MemberMapper {  //파일명 오타  MemeberMapper
	public MemberDTO read(String userid);
}
