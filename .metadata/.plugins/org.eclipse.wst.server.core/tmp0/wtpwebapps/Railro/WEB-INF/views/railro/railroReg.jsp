<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div id="content">
	<form action="" method="post" enctype="multipart/form-data" name="">
		<input type="hidden" name="BOARD_ID" value="">
		<table class="register" width="100%">
			<tr>
				<td>
					<div align="left">작성자</div>
				</td>
				<td>
				 	수빈
				</td>
			</tr>
			<tr>
				<td>
					<div align="left">제 목</div>
				</td>
				<td>
					<input name="BOARD_SUBJECT" type="text" size="50" maxlength="100" value=""/>
				</td>
			</tr>
			<tr>
				<td style="vertical-align: top">
					<div align="left">내 용</div>
				</td>
				<td>
					<textarea name="BOARD_CONTENT" cols="67" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<div align="left">첨부파일</div>
				</td>
				<td>
					<input class="upload-name" value="파일선택" disabled="disabled">
					<label for="upload">찾아보기</label> 
                    <input type="file" id="upload" class="file_hidden"> 
				</td>
			</tr>
		</table>
		<div class="btn">
			<a href="">등록</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="javascript:history.go(-1)">취소</a>
		</div>
	</form>
</div>