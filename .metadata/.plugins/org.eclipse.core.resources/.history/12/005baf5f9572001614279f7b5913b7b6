<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="content">
	<div class="setting">
		<div class="limit-setting">
			<form action="" method="get">
				<select name="limit" onchange="this.form.submit()">
					<option value="5">5</option>
					<option value="10" selected="selected">10</option>
					<option value="15">15</option>
					<option value="20">20</option>
				</select>
				개씩 보기
			</form>
		</div>
		<span>글 개수 : <b>${listCount}</b></span>
	</div> 
	
	<form name="listForm" action="freeBoardList.htm">
		<input type="hidden" name="pageNo" value=""/>
		<table width="100%">
		  <tr>
		    <th width="10%">글번호</th>
		    <th width="10%">분류</th>
		    <th width="50%" style="text-align: left">제목</th>
		    <th width="10%">작성자</th>
		    <th width="10%">조회수</th>
		    <th width="10%">작성일</th>
		  </tr>
		  
		 <c:forEach var="freeBoard" items="${freeBoardList}">
		  <tr>
		  	<td> ${freeBoard.ID}</td>
		  	<td>${freeBoard.SUBJECT}</td>
		  	<td style="text-align: left"><a href="freeBoardDetail.htm?ID=${freeBoard.ID}">${freeBoard.TITLE}</a></td>
		  	<td>${freeBoard.WRITER}</td>
		  	<td>${freeBoard.HIT}</td>
		  	<td>${freeBoard.REGDATE}</td>
		  </tr>
		  </c:forEach>
		</table>
		
		<div class="button1">
			<input type="button" onclick="location.href='freeBoardReg.htm'" value="글등록"/>
		</div>
		
		<div class="paging" align="center">
			<jsp:include page="../inc/paging.jsp" flush ="true">
				<jsp:param name="firstPageNo" value="${paging.firstPageNo}" />
				<jsp:param name="prevPageNo" value="${paging.prevPageNo}" />
				<jsp:param name="startPageNo" value="${paging.startPageNo}" />
				<jsp:param name="pageNo" value="${paging.pageNo}" />
				<jsp:param name="endPageNo" value="${paging.endPageNo}" />
				<jsp:param name="nextPageNo" value="${paging.nextPageNo}" />
				<jsp:param name="finalPageNo" value="${paging.finalPageNo}" />
			</jsp:include>
		</div>
	</form>

    <!-- 검색입력 폼 -->
	<form method="post" action="freeBoardList.htm">
		<div class="search">
		  	<select name="keyField">
		  		<option value="ID">번호 </option>
		        <option value="WRITER">작성자 </option>
		        <option value="TITLE">제목 </option>
				<option value="CONTENTS">내용 </option>
				<option value="SUBJECT">분류 </option>
		    </select>
		  	<input type="text" name="keyWord" size="15"/>
			<input type="submit" value="검색"/>
		</div>
	 </form>
</div>


