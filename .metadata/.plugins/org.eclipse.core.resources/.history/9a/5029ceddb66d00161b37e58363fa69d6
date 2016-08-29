<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="content">
	<form method="post" action="freeBoardEdit.htm?ID=${board.ID}" >
		<table width="65%">
    		<tr>
				<td>작성자</td>
				<td>
				 &nbsp;&nbsp;&nbsp;
				${board.WRITER}
				</td>
			</tr>
			<tr>
				<td>
					<div align= "left">분 류 </div>
				</td>
				<td>
				&nbsp;
				 <select name="SUBJECT">
					 <option> 분류1 </option>
					 <option> 분류2 </option>
					 <option> 분류3 </option>
					 <option> 분류4 </option>
				 </select>
				</td>
			</tr>
    		<tr>
     			<td>제 목</td>
     			<td>
     			<input type="text" name="TITLE" size="50" value="${board.TITLE}"></td>
    		</tr>
    		<tr>
     			<td style="vertical-align: top" >
     			내 용

     			</td>
     			<td>
     			<textarea name="CONTENTS" rows="10" cols="auto">
     			${board.CONTENTS}
     			</textarea>
     			</td>
    		</tr>
		</table>
		<div class="button">
			<input type="submit" value="수정"/>
			<button onclick="javasrcipt:history.go(-1)">취소</button>
		</div>
	</form>
</div>