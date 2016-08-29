<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="content">
	<div class="setting">
		<div class="limit-setting">
			<form action="" method="get">
				<select name="limit" onchange="limit_submit()">
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
	  	<td style="text-align: left"><a href="freeBoardDetail.htm?ID=${freeBoard.ID}">${freeBoard.TITLE}></a></td>
	  	<td>${freeBoard.WRITER}</td>
	  	<td>${freeBoard.HIT}</td>
	  	<td>${freeBoard.REGDATE}</td>
	  </tr>
	  </c:forEach>
	</table>
	
	<div class="button1">
		<button class="button" onclick="location.href='freeBoardReg.htm'">글등록</button>
	</div>
	<div class="paging" align="center">
	이전&nbsp;다음
	</div>

      <!-- 검색입력 폼 -->
	<form method= post action="">
		<div class="search">
		  	<select name="src_name">
		        <option value="name">이름 </option>
		        <option value="subject" selected>제목 </option>
				<option value="memo">내용 </option>
		    </select>
		  	<input type="text" name="src_value" size="15"/>
			<input type="submit" value="검색"/>
		</div>
	 </form>
</div>


