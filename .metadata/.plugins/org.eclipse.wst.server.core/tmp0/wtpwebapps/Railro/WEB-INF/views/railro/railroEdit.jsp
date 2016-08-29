<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div id="content">
	<form action="railroEdit.htm?ID=${board.ID}" method="post">
		<table class="modify" width="100%">
			<tr>
				<td>
					<div align="left">작성자</div>
				</td>
				<td>
				 	${board.WRITER}
				</td>
			</tr>
			<tr>
				<td>
					<div align="left">분 류</div>
				</td>
				<td>
					<select name="SUBJECT">
						<option>분류1</option>
						<option>분류2</option>
						<option>분류3</option>
						<option>분류4</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<div align="left">제 목</div>
				</td>
				<td>
					<input name="TITLE" type="text" size="50" maxlength="100" value="${board.TITLE}"/>
				</td>
			</tr>
			<tr>
				<td >
					<div align="left" style="position: absolute">내 용</div>
				</td>
				<td>
					<textarea name="CONTENTS" cols="67" rows="10">${board.CONTENTS}</textarea>
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
			<input type="submit" value="수정"/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<span><a href="javascript:void(0)" onclick="javascript:history.go(-1)">취소</a></span>
		</div>
	</form>
</div>