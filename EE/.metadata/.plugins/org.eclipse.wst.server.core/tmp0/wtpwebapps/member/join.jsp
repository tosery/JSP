<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  /> 
<!DOCTYPE html>
<html lang="ko">
<head>
<%--     include head.jsp --%>
    <jsp:include page="/head.jsp" />
</head>
<body>
    <%-- include topNavbar.jsp --%>
	<jsp:include page="/Nav.jsp" />

    
    <!-- middle container -->
    <div class="container mt-4">
      <div class="row">

<!--         Left Menu -->
<!--         <div class="col-sm-3"> -->

<!--         </div> -->
<!--         end of Left Menu  -->


        <!-- Right area -->
        <div class="col">
          
          <!-- Contents area -->
          <div class="border border-info p-4 rounded">
            <h5>회원 가입</h5>

            <hr class="featurette-divider">

            <form name="newMember" method="POST" action="/member/addMember.do" onsubmit="return checkForm()">
              <div class="form-group">
                <label for="id">
                  <i class="material-icons align-middle">account_box</i>
                  <span class="align-middle">아이디</span>
                </label>
                <input type="text" class="form-control" id="id" name="id" required>
              </div>

              <div class="form-group">
                <label for="password">
                  <i class="material-icons align-middle">lock</i>
                  <span class="align-middle">비밀번호</span>
                </label>
                <input type="password" class="form-control" id="password"  name="passwd" required>
              </div>
              <div class="form-group">
                <label for="password2">
                  <i class="material-icons align-middle">check</i>
                  <span class="align-middle">비밀번호 재확인</span>
                </label>
                <input type="password" class="form-control" id="password2">
              </div>

              <div class="form-group">
                <label for="name">
                  <i class="material-icons align-middle">person</i>
                  <span class="align-middle">이름</span>
                </label>
                <input type="text" class="form-control" id="name" name="name">
              </div>

              <div class="form-group">
                <label for="birthday">
                  <i class="material-icons align-middle">event</i>
                  <span class="align-middle">생년월일</span>
                </label>
                <input type="date" class="form-control" id="birthday" name="birthday">
              </div>

              <div class="form-group">
                <label for="gender">
                  <i class="material-icons align-middle">wc</i>
                  <span class="align-middle">성별 선택</span>
                </label>
                <select class="form-control" id="gender" name="gender">
                  <option value="" disabled selected>성별을 선택하세요.</option>
                  <option value="M">남자</option>
                  <option value="F">여자</option>
                  <option value="U">선택 안함</option>
                </select>
              </div>

              <div class="form-group">
                <label for="email">
                  <i class="material-icons align-middle">mail</i>
                  <span class="align-middle">이메일 주소</span>
                </label>
                <input type="email" class="form-control" id="email" name="email">
              </div>

              <div class="text-center">
                <label class="mr-3">이벤트 등 알림 메일 수신동의 : </label>
                <div class="custom-control custom-radio custom-control-inline">
                  <input type="radio" id="customRadioInline1" name="recv_email" class="custom-control-input" value="Y" checked>
                  <label class="custom-control-label" for="customRadioInline1">동의함</label>
                </div>
                <div class="custom-control custom-radio custom-control-inline">
                  <input type="radio" id="customRadioInline2" name="recv_email" class="custom-control-input" value="N">
                  <label class="custom-control-label" for="customRadioInline2">동의 안함</label>
                </div>
              </div>
              
              <div class="my-3 text-center">
                <input type="submit" class="btn btn-primary" value="등록"></input>
                <button type="reset" class="btn btn-primary ml-3">초기화</button>
              </div>
            </form>

          </div>
          <!-- end of Contents area -->
        </div>
        <!-- end of Right area -->
      </div>
    </div>
    <!-- end of middle container -->
<%-- <jsp:forward page="listMembers.jsp" /> --%>



    
    <%-- include javascripts.jsp --%>
<%--     <jsp:include page="/javascripts.jsp" /> --%>

</body>
</html>