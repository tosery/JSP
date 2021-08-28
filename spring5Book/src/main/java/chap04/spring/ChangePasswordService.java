package chap04.spring;

import org.springframework.beans.factory.annotation.Autowired;

import chap03.spring.Member;
import chap03.spring.MemberDao;
import chap03.spring.MemberNotFoundException;

public class ChangePasswordService {
	@Autowired
	private MemberDao memberDao;

	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) { throw new MemberNotFoundException(); }
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
