<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="content">
	<form name="" method="post" action="" onsubmit="" >
		<input type="hidden" name="TYPE" value="1"/>
		<table width="65%">
    		<tr>
				<td>작성자</td>
				<td>
				&nbsp;&nbsp;&nbsp;홍혜진
				</td>
			</tr>
			<tr>
     			<td>분 류</td>
     			<td>
     				<select name="SUBJECT">
     					<option value="주제1">주제1</option>
     					<option value="주제2">주제2</option>
     					<option value="주제3">주제3</option>
     				</select>
     			</td>
    		</tr>
    		<tr>
     			<td>제 목</td>
     			<td><input type="text" name="TITLE" size="50"></td>
    		</tr>
    		<tr>
     			<td style="vertical-align: top">내 용</td>
     			<td>
     			<textarea name="CONTENTS" rows="10" cols="auto"></textarea>
     			</td>
    		</tr>	
		</table>
		<div class="button">
			<input type="submit" value="등록"/>
			<button onclick="javasrcipt:history.go(-1)">취소</button>
		</div>
	</form>
</div>