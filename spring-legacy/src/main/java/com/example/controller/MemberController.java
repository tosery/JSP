package com.example.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;
import com.example.service.MemberService;
import com.example.util.Script;


@Controller // @Component 계열 애노테이션
@RequestMapping("/member/*")
public class MemberController {
	
	private MemberService memberService;
	
	//생성자라서 @Autowired 생략가능
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}


	@GetMapping("/join") // /member/join
	public String join() {
		System.out.println("join 호출됨...");
		return "member/join";
	}
	
	
	@PostMapping("/join")
	public ResponseEntity<String> join(MemberVO memberVO) {
		
		//비밀번호 암호화 하기
		String passwd = memberVO.getPasswd();
		String hasedPw = BCrypt.hashpw(passwd, BCrypt.gensalt());
		memberVO.setPasswd(hasedPw); //암호화된 비밀번호로 재설정
		
		//연월일 구분문자("-" 제거하기)
		String birthday = memberVO.getBirthday(); // "2021-08-25"
		birthday = birthday.replace("-", ""); // "20210825"
		memberVO.setBirthday(birthday);
		
		//현재시점 날짜 객체로 설정
		memberVO.setRegDate(new Date());
		System.out.println(memberVO);
		memberService.register(memberVO);
		
		//서버에서 데이터를 추가,수정,삭제 후 화면응답을 바로 줄 때는
		//새로고침 발생 시 서버에 오류가 발생될 수 있으므로
		//리다이렉트를 통해 사용자가 봐야 될 화면 주소로 요청하게 만든다.
		//브라우저가 요청하게끔 만드는거다.
		//return "redirect:/member/login";
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/html; charset=UTF-8");
		
		String str = Script.href("회원가입 성공!", "/member/login");//이부분 복습
		
		return new ResponseEntity<String>(str, headers, HttpStatus.OK);
		
	}
	
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
//만약에 매개변수 안넣고 하려면?
//일치하지 않는 아이디로 로그인을 하면 null이 되기에 널체크해야함
	@PostMapping("/login")
	public ResponseEntity<String>  login(String id, String passwd, String rememberMe, 
			HttpSession session, HttpServletResponse response) {
		
		MemberVO memberVO = memberService.getMemberById(id);
		
		boolean isPasswdSame = false;
		
		String message = "";
		if(memberVO != null) {
			isPasswdSame = BCrypt.checkpw(passwd, memberVO.getPasswd());
			if(!isPasswdSame) {//비밀번호가 일치하지 않는다.
				message = "비밀번호가 일치하지 않습니다.";
			}
		} else { //memberVO == null이면 일치하는 아이디가 없다
			message = "존재하지 않는 아이디 입니다.";
		}
		if(memberVO == null || isPasswdSame == false) {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "text/html; charset=UTF-8");
			
			String str = Script.back(message);
			
			return new ResponseEntity<String>(str, headers, HttpStatus.OK);
		}
		
		//로그인 성공 시, 로그인 인증하기
		session.setAttribute("id", id);
		
		//로그인 상태유지가 체크되었으면
		if(rememberMe != null) {
			Cookie cookie = new Cookie("id",id);
			cookie.setPath("/");
			cookie.setMaxAge(60 * 10);//생략하면 0초 바로 삭제함 60초 * 10 (10분)간 유지됨
			
//			Cookie cookie2 = new Cookie("id",id);
//			cookie.setPath("/");
//			cookie.setMaxAge(60 * 10);//생략하면 0초 바로 삭제함 60초 * 10 (10분)간 유지됨
			
			response.addCookie(cookie);//응답 객체에 쿠키를 추가해놓으면 최종응답시 쿠키를 클라이언트에게 전송해준다.
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "/");//redirect 경로 지정
		
		//리다이렉트일 경우 HttpStatus.FOUND로 지정해야 함.
		return new ResponseEntity<String>(headers, HttpStatus.FOUND);
	}//로그인
	
	@GetMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		//세션 초기화
		session.invalidate();
		
		//로그인 상태유지용 쿠키 있으면 삭제
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie cookie: cookies) {
				if(cookie.getName().equals("id")) {
					cookie.setMaxAge(0); // 삭제되도록 썩은쿠키!! 
					cookie.setPath("/");
					
					response.addCookie(cookie);
				}
			}
		}
		
		return "redirect:/";
	}
}






