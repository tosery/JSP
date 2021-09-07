<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />   
<%
  request.setCharacterEncoding("UTF-8");
%>   
<!DOCTYPE html>
<html lang="ko">
<body>
    <!-- middle container -->
    <div class="container mt-4">
      <div class="row">

        <!-- Left Menu -->
        <div class="col-sm-3">

          <!-- end of Vertical Nav -->
        </div>
        <!-- end of Left Menu -->


        <!-- Right area -->
        <div class="col-sm-12">

          <!-- Contents area -->
          <div class="border border-info p-4 rounded">
<%--             <h5>게시판 글목록 (글개수: ${ pageMaker.totalCount })</h5> --%>
				<h5>게시판 글목록</h5>
            <hr class="featurette-divider">
              
            <c:if test="${ not empty sessionScope.id }">
            	<!-- 새글쓰기 버튼 -->
	            <button type="button" class="btn btn-primary btn-sm float-right my-3" onclick="location.href = '/board/write?pageNum=${ pageMaker.cri.pageNum }';">
	              <i class="material-icons align-middle">create</i>
	              <span class="align-middle">새글쓰기</span>
	            </button>
            </c:if>
              
            <div class="clearfix"></div>

            <!-- 글목록 테이블 -->
            <table class="table table-hover" id="board">
              <thead>
                <tr>
                  <th scope="col" class="text-center">번호</th>
                  <th scope="col" class="text-center">작성자</th>
                  <th scope="col" class="text-center">글제목</th>
                  <th scope="col" class="text-center">작성일</th>
                </tr>
              </thead>
              <tbody>
              
              <c:choose>
              	<c:when test="${ !empty articlesList }">
              	
              		<c:forEach var="article" items="${ articlesList }" varStatus="articleNum">
              			<tr>
		                  <td class="text-center">${ articleNum.count}</td>
		                  <td class="text-center">${article.mid }</td>
		                  <td>
							<c:choose>
								<c:when test='${article.level > 1 }'>  
									<c:forEach begin="1" end="${article.level }" step="1">
										<span style="padding-left:10px"></span>    
									</c:forEach>
									<span style="font-size:12px;">[답변]</span>
									<a class="text-center" href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title}</a>
								</c:when>
								<c:otherwise>
									<a class="text-center" href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title }</a>
								</c:otherwise>
							</c:choose>
		                    <a class="text-center" href="/board/content?num=${ board.num }&pageNum=${ pageMaker.cri.pageNum }">${ board.subject }</a>
		                  </td>
<%-- 		                  <td class="text-center">${ board.mid }</td> --%>
<%-- 		                  <td class="text-center"><fmt:formatDate value="${ board.regDate }" pattern="yyyy.MM.dd" /></td> --%>
<%-- 		                  <td class="text-center">${ board.readcount }</td> --%>
							<td class="text-center"><fmt:formatDate value="${article.writeDate}" /></td> 
		                </tr>
              		</c:forEach>
              	</c:when>
              	<c:otherwise>
              		<tr>
	                  <td colspan="5" class="text-center">게시판 글이 없습니다.</td>
	                </tr>
              	</c:otherwise>
              </c:choose>
  
              </tbody>
            </table>


            <!-- pagination area -->
            <nav aria-label="Page navigation example">
              <ul class="pagination justify-content-center my-4">
              
              <%-- 이전 --%>
              <li class="page-item ${ (pageMaker.prev) ? '' : 'disabled' }">
              	<a class="page-link" href="${ (pageMaker.prev) ? '/board/list?pageNum=' += (pageMaker.startPage - 1) += '&type=' += pageMaker.cri.type += '&keyword=' += pageMaker.cri.keyword : '' }#board">이전</a>
              </li>
              
              <%-- 시작페이지 번호 ~ 끝페이지 번호 --%>
              <c:forEach var="i" begin="${ pageMaker.startPage }" end="${ pageMaker.endPage }" step="1">
              	<li class="page-item ${ (pageMaker.cri.pageNum eq i) ? 'active' : '' }">
              		<a class="page-link" href="/board/list?pageNum=${ i }&type=${ pageMaker.cri.type }&keyword=${ pageMaker.cri.keyword }#board">${ i }</a>
              	</li>
              </c:forEach>
              
              <%-- 다음 --%>
              <li class="page-item ${ (pageMaker.next) ? '' : 'disabled' }">
              	<a class="page-link" href="${ (pageMaker.next) ? '/board/list?pageNum=' += (pageMaker.endPage + 1) += '&type=' += pageMaker.cri.type += '&keyword=' += pageMaker.cri.keyword : '' }#board">다음</a>
              </li>

              </ul>
            </nav>
            <!-- end of pagination area -->

            <hr class="featurette-divider">

              
            <!-- Search area -->
            <form class="form-inline justify-content-center my-4" action="/board/list?#board" method="get">
          
              <div class="form-group mx-3">
                <label for="searchType">검색 조건</label>
                <select class="form-control mx-2" id="searchType" name="type">
                  <option value="" disabled selected>--</option>
                  <option value="T" ${ (pageMaker.cri.type eq 'T') ? 'selected' : '' }>제목</option>
                  <option value="C" ${ (pageMaker.cri.type eq 'C') ? 'selected' : '' }>내용</option>
                  <option value="W" ${ (pageMaker.cri.type eq 'W') ? 'selected' : '' }>작성자</option>
                </select>
              </div>

              <label for="searchKeyword">검색어</label>
              <input type="text" class="form-control mb-2 mr-sm-2 mx-2" id="searchKeyword" placeholder="검색어" name="keyword" value="${ pageMaker.cri.keyword }">

              <button type="submit" class="btn btn-primary mb-2">
                <i class="material-icons align-middle">search</i>
                <span class="align-middle">검색</span>
              </button>
            </form>
            <!-- end of Search area -->
          </div>
          <!-- end of Contents area -->
        </div>
        <!-- end of Right area -->
      </div>
    </div>
    <!-- end of middle container -->

</body>
</html>