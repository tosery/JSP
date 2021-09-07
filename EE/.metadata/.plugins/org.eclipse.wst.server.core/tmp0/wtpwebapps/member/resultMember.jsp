<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel="stylesheet" href="/resources/css/bootstrap.css" />
<title>회원 정보</title>
</head>
<body>
	<jsp:include page="/Nav.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원정보</h1>
		</div>
	</div>
	<div class="container" align="center">
		<%
			String msg = request.getParameter("msg");

			if (msg != null) {
				if (msg.equals("0"))
					out.println(" <h2 class='alert alert-danger'>회원정보가 수정되었습니다.</h2>");
				else if (msg.equals("1"))
					out.println(" <h2 class='alert alert-danger'>회원가입을 축하드립니다.</h2>");
				else if (msg.equals("2")) {
					String loginId = (String) session.getAttribute("sessionId");
					out.println(" <h2 class='alert alert-danger'>" + loginId + "님 환영합니다</h2>");
				}				
			} else {
				out.println("<h2 class='alert alert-danger'>회원정보가 삭제되었습니다.</h2>");
			}
		%>
	</div>
	 <form class="form-signin" action="/member/login.do" method="POST">
    <a href="/welcome.jsp" title="Home으로 가기">
     <i class="material-icons">account_balance</i>
    </a>
    <h1 class="h3 mb-3 font-weight-normal">회원 로그인</h1>

    <label for="inputId" class="sr-only">ID</label>
    <input type="text" name="id" id="inputId" class="form-control" placeholder="아이디" required autofocus>

    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" name="passwd" id="inputPassword" class="form-control" placeholder="비밀번호" required>

    <div class="custom-control custom-checkbox text-center mb-3">
      <input type="checkbox" class="custom-control-input" id="customCheck1" name="rememberMe" value="remember-me">
      <label class="custom-control-label" for="customCheck1">로그인 상태 유지</label>
    </div>

    <button class="btn btn-lg btn-primary btn-block" type="submit">
      <i class="material-icons align-middle">login</i>
      <span class="align-middle">로그인</span>
    </button>

    <hr class="featurette-divider">

    <div class="text-center text-secondary">
      <a href="#!">아이디 찾기</a>
      | <a href="#!">비밀번호 찾기</a>
      | <a href="/join">회원가입</a>
    </div>
    
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
  </form>	
</body>
</html>