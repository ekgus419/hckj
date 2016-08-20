<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<head>
<title>우편번호 찾기</title>
<link href="${pageContext.request.contextPath}/css/<tiles:getAsString name="css"/>" type="text/css" rel="stylesheet"/>
<script>
function setZipcode(zip1,zip2,addr){
	opener.document.forms[0].MEMBER_ZIPCODE1.value=zip1;
	opener.document.forms[0].MEMBER_ZIPCODE2.value=zip2;
	opener.document.forms[0].MEMBER_ADDR1.value=addr;
	self.close();
}
</script>
</head>
<body>
<form action="" method="post" name="form">
<table width="80%">
	<tr align="center">
		<th align="center">
			<b>우편번호 검색</b>
			<br />
		</th>
	</tr>
	<tr align="center">
		<td align="center">
			지역명 : 
			<input type="text" name="dong" size="10"/>
			<input type="submit" value="검색"><br />
			동을 입력하세요. (예:방배, 원천, 2글자 이상입력)
		</td>
	</tr>
</table>
</form>
<br>
<table width="80%">
	<tr height="35">
		<td align="center" colspan="100%">검색결과</td>
	</tr>
	<tr>

	<tr>
		<td colspan="100%" align="center">검색 결과가 없습니다.</td>
	</tr>
</table>
</body>
</html>