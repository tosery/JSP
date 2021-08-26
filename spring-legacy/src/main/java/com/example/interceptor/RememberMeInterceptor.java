package com.example.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RememberMeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//컨트롤러 메소드 호출전에 실행
		//요청 사용자의 세션 가져오기
		HttpSession session = request.getSession();
		//세션에 로그인 아이디가 있는지 확인
		String id = (String) session.getAttribute("id");
		/*세션에 아이디가 없으면 로그인 상태유지용 쿠키정보 가져와서
		 세션에 저장한 후 현재 호출된 컨트롤러 메소드를 호출되도록 true 리턴함*/
		if(id == null) {
			Cookie[] cookies = request.getCookies();
			if(cookies != null) {
				//쿠키 이름이 "id"인 쿠키 객체 찾기
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("id")) {
						id = cookie.getValue();//세션 찾고나서 없어서 쿠키찾아보니 있더라...
						// 로그인 인증 처리("세션에 id값 저장)
						session.setAttribute("id", id);
					}
				}
				
			}
		}
		return true;//false 하면 컨트롤러 호출이 안된다. 경우에 따라서는 if문 써서한다.
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//컨트롤러 메소드 호출 이후에 실행
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//컨트롤러 메소드 호출에 실행
	}

}
