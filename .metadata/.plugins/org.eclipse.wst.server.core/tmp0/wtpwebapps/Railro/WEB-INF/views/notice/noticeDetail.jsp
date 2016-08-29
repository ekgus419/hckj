<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div id="content">
	<form action="" method="post" enctype="multipart/form-data" name="">
		<table class="detail" width="100%">
			<tr>
				<td colspan="10">
					${notice.TITLE}
					&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
			<tr class="title">
				<td width="65%" >
				 	${notice.WRITER}
				</td>
				<td width="13%" style="text-align: right;">
				 	${notice.REGDATE}
				</td>
				<td width="11%" style="text-align: right;">
				 	조회 수 <b>${notice.HIT}</b>
				</td>
				<td width="11%" style="text-align: right;">
				 	댓글 수 3
				</td>
			</tr>
			<tr>
				<td colspan="10">
				 ${notice.CONTENTS}
				</td>
			</tr>
			<tr>
				<td colspan="10">
					첨부파일 목록
				</td>
			</tr>
		</table>
		<div class="btn">
			<span><a href="noticeEdit.htm?ID=${notice.ID}">수정</a></span>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<span><a href="javascript:void(0)" onclick="javascript:history.go(-1)">취소</a></span>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<span><a href="">삭제</a></span>
		</div>
	</form>
</div>