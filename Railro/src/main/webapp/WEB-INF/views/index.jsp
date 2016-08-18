<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<<<<<<< HEAD
<div id="content">
<h2>게시판 목록</h2>
<!DOCTYPE html>
<html>
<head>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}
</style>
<body>
<table>
  <tr>
    <th>글번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>조회수</th>
    <th>작성일</th>
  </tr>

</table>

</head>


<button class="button button1">글등록</button>

		<!-- 검색입력 폼 -->
	<form method= post action='list.php'>
	<tr>
		<td width=100%  colspan=5 alingn=center>
			
			<select name = src_name>
			<option value=name>이름 </option>
			<option value=subject selected>제목 </option>
			<option value=memo>내용 </option>
			</select>
			
			<input type=text name = src_value size=30>
			<input type=submit value = 검색>
		
		</td>
	</tr>
	</form>
	
</body>

</html>

=======
<div class="content">
	<div class="setting">
		<div class="limit_setting">
			<form action="" method="get">
				<select name="limit">
					<option value="5">5</option>
					<option value="10" selected="selected">10</option>
					<option value="15">15</option>
					<option value="20">20</option>
				</select>
				개씩 보기
				<input class="submit" type="submit" value="선택"/>
			</form>
		</div>
		<span>글 개수 :</span>
	</div>
	<table class="list" width="100%">
		<tr class="list_col" align="center" valign="middle">
			<td width="8%">
				<div align="center">번호</div>
			</td>
			<td width="40%">
				<div align="center">제목</div>
			</td>
			<td width="10%">
				<div align="center">작성자</div>
			</td>
			<td width="15%">
				<div align="center">날짜</div>
			</td>
			<td width="8%">
				<div align="center">조회수</div>
			</td>
		</tr>
		<tr class="list_contents" align="center" valign="middle"
			onmouseover="this.style.backgroundColor='#E8E8E8'"
			onmouseout="this.style.backgroundColor=''">
			<td>
				<div align="center">1</div>
			</td>	
			<td>
				<div align="left">글제목ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ</div>
			</td>
			<td>
				<div align="center">수빈</div>
			</td>
			<td>
				<div align="center">2016/01/13</div>
			</td>	
			<td>
				<div align="center">34</div>
			</td>
		</tr>
	</table>
	<div class="register_btn" align="right">
		<a href="">[글쓰기]</a>
	</div>
	<div class="paging" align="center">
	[이전]&nbsp;[다음]
	</div>
	<div class="search" align="center">
		<form action="" method="get">
			<select name="keyField">
				<option value="BOARD_NUM">번호</option>
				<option value="BOARD_ID">작성자</option>
				<option value="BOARD_SUBJECT">제목</option>
			</select>
			<input type="text" name="keyWord"/>
			<input class="submit" type="submit" value="검색"/>
		</form>
	</div>
</div>
>>>>>>> bd26b1dfefcf4d4fb3bda6f145798cb8db377980
