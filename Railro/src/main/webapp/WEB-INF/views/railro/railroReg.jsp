<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div id="content">
	<form action="" method="post" enctype="multipart/form-data" name="">
		<input type="hidden" name="BOARD_ID" value="">
		<table>
			<tr>
				<td>
					<div align="center">글쓴이</div>
				</td>
				<td>
				 	수빈
				</td>
			</tr>
			<tr>
				<td>
					<div align="center">제 목</div>
				</td>
				<td>
					<input name="BOARD_SUBJECT" type="text" size="50" maxlength="100" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<div align="center">내 용</div>
				</td>
				<td>
					<textarea name="BOARD_CONTENT" cols="67" rows="15"></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<div align="center">파일 첨부</div>
				</td>
				<td>
					<input name="BOARD_FILE" type="file"/>
				</td>
			</tr>
		</table>
		<a href="javascript:addboard()">[등록]</a>&nbsp;&nbsp;
		<a href="javascript:history.go(-1)">[뒤로]</a>
	</form>
</div>