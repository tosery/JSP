package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.MemberVO;
import com.example.mapper.MemberMapper;

//이거 왜 만들어? 트랜잭션 하려고! 단위업무
@Service //@Component계열 애노테이션
@Transactional //(필요한 곳에만 하는게 좋다)
public class MemberService {
	
	private MemberMapper memberMapper;
	//생성자로 하지 않으면 스프링에서만 읽을 수 있다. 다른곳 불가능
	//생성자에서는 @Autowired 생략가능
	public MemberService(MemberMapper memberMapper) {
		super();
		this.memberMapper = memberMapper;
	}
	
	public void register(MemberVO memberVO) {
		memberMapper.insert(memberVO);
	}
	
	public MemberVO getMemberById(String id) {
/*		MemberVO memberVO = memberMapper.getMemberById(id);
		return memberVO;
*/
		return memberMapper.getMemberById(id);
	}
	
	public List<MemberVO> getMembers(){
		return memberMapper.getMembers();
	}
	
	public int getCountById(String id) {
		return memberMapper.getCountById(id);
	}
	
	public int deleteMemberById(String id) {
		int rowCount = memberMapper.deleteMemberById(id);
		return rowCount;
	}
	
	public void updateMember(MemberVO memberVO) {
		memberMapper.updateMember(memberVO);
	}
	
}
