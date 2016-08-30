<%@ page language="java" contentType="text/html; charSet=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="pagination">
	<a href="javascript:goPage(${param.firstPageNo})" class="first">처음&nbsp;</a>
	<a href="javascript:goPage(${param.prevPageNo})" class="prev">이전&nbsp;</a>
	<span>
		<c:forEach var="i" begin="${param.startPageNo}" end="${param.endPageNo}" step="1">
			<c:choose>
				<c:when test="${i eq param.pageNo}">
					<a href="javascript:goPage(${i})" class="selected">${i}&nbsp;</a>
				</c:when>
				<c:otherwise>
					<a href="javascript:goPage(${i})">${i}&nbsp;</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</span>
	<a href="javascript:goPage(${param.nextPageNo})" class="next">다음&nbsp;</a>
	<a href="javascript:goPage(${param.finalPageNo})" class="last">마지막</a>
</div>

<style>
.selected{
	font-weight: bold;
}
</style>
