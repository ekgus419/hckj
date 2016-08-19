<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<<<<<<< HEAD
=======
<div class="content">
<<<<<<< HEAD
</div>

=======
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 수정</title>
</head>

<script>
function move(url) {
	location.href=url;
}

function boardUpdateCheck() {
	var form = document.BoardUpdateForm;
	return true;
}
</script>

<style>
@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
body {
	font-family: 'Nanum Gothic', sans-serif;
}
</style>
<body>

	<table summary="글수정 전체 테이블">
		<form name="BoardUpdateForm" method="post" action="Board_Write_action.jsp" 
														onsubmit="return boardUpdateCheck();" >
		
   		<colgroup>
   			<col width="20%">
   			<col width="80%">
   			
   		</colgroup>
   	

		<table summary="테이블 구성" >
		<caption>글 수정하기</caption>	
    		<tr>
				<td>작성자</td>
				<td><input type=text name=name size=10 maxlength=8></td>
			</tr>
			<tr>
	 			<td>E-Mail</td>
	 			<td><input type=text name=email size=30></td>
    		</tr>
    		<tr>
     			<td>홈페이지</td>
     			<td><input type=text name=homepage size=30></td>
    		</tr>
    		<tr>
     			<td>제 목</td>
     			<td><input type=text name=title></td>
    		</tr>
    		<tr>
     			<td>내 용</td>
     			<td><textarea name=content rows ="10" cols="100"></textarea></td>
    		</tr>
    		<tr>
     			<td>비밀번호</td> 
     			<td><input type=password name=password size=15 maxlength=15></td>
    		</tr>
    		<tr>
     			<td colspan=2><hr size=1></td>
    		</tr>
    		<tr>
     			<td colspan="2"><div align="center">
     			<input type="submit" value="수정">&nbsp;&nbsp;
				<input type=reset value="다시 수정"> 
         		<input type="button" value="뒤로" onclick="move('Board_List.jsp');"></div>
     			</td>
    		</tr> 
		</table>
	</form> 
</table>

</body>
</html>
=======
<div id="content">

<<<<<<< HEAD
</div>
=======
</div>
>>>>>>> a1e14330cc56f5985cb47b0468fa4c1d28eb3eaa
>>>>>>> 5d18c4e12ed14c66a4b5b60c2478e0f9f15e83ea
>>>>>>> 9476964a23513f0ffd5f2aefadae99951c7dfe8f
>>>>>>> e660b3b4c2142f19453fc2d5b73b3024b8972bbd
