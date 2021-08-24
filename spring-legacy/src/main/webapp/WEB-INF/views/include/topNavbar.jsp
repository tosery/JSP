<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container">

        <a class="navbar-brand" href="/">
          <i class="material-icons">android</i>
          Logo
        </a>
        
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/member/join">회원가입</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/member/login.jsp">로그인</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">로그아웃</a>
            </li>

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                내정보 관리
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">비밀번호 변경</a>
                <a class="dropdown-item" href="#">내정보 수정</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">회원탈퇴</a>
              </div>
            </li>

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                게시판
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="/board/boardList.jsp">게시판</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">갤러리</a>
              </div>
            </li>

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                채팅 서비스
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">심플 채팅</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">채팅방 목록</a>
              </div>
            </li>

            <li class="nav-item">
              <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="검색" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
          </form>
        </div>
      </div>
    </nav>
    <!-- end of Navbar -->
    