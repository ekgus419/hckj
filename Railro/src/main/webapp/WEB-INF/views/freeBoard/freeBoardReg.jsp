<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="content">
	<form method="post" action="freeBoardReg.htm">
		<table width="65%">
    		<tr>
				<td>작성자</td>
				<td>
				&nbsp;&nbsp;&nbsp;홍혜진
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
     			<input type=text name="TITLE" size="50"></td>
    		</tr>
    		<tr>
     			<td style="vertical-align: top">내 용</td>
     			<td>
     			<textarea name="CONTENTS" rows="10" cols="auto"></textarea>
     			</td>
    		</tr>
    		
		</table>
		<div class="button">
			<button type="submit">등록</button>		
			<button onclick="javasrcipt:history.go(-1)">취소</button>
		</div>
	</form>
</div>