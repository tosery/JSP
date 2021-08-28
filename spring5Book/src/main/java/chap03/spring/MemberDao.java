package chap03.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	
	public Collection<Member> selectAll(){
		return map.values();
	}
	
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
}
