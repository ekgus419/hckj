<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<script src="${pageContext.request.contextPath}/js/login.js"></script>

<div class="content">
	<form name="loginform" action="" method="post" onsubmit="return check()">
		<table class="join" width="40%">
			<tr>
				<th colspan="100%">
					<div class="login-title"><span>로그인</span></div>
				</th>
			</tr>
			<tr>
<<<<<<< HEAD
				<td colspan="30%">
					아이디
					&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="40%">
					<input type="text" name="ID" size="18" maxlength="15"/>
					&nbsp;
=======
				<td colspan="20%">
					아이디
					&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="30%">
					<input type="text" name="ID" size="13" maxlength="15"/>
					
>>>>>>> c812f8a7d774aac5a2bf2e2dc6c084c9d49451c3
				</td>
				<td rowspan="2" colspan="30%">
					<input type="submit" value="로그인" />
				</td>
			</tr>
			<tr>
<<<<<<< HEAD
				<td colspan="30%">
					비밀번호
					&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="40%">
					<input type="password" name="PWD" size="18" maxlength="20"/>
					&nbsp;
=======
				<td colspan="20%">
					비밀번호
					&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="30%">
					<input type="password" name="PWD" size="13" maxlength="20"/>
					
>>>>>>> c812f8a7d774aac5a2bf2e2dc6c084c9d49451c3
				</td>
			</tr>
			<tr>
				<td class="sub_btn" colspan="100%"> 
					<a href="javascript:void(0)" onclick="location.href='join.htm'">회원가입</a>
					&nbsp;&nbsp;&nbsp;
					<input type="button" onclick="openConfirmId(this.form)" value="아이디/비밀번호 찾기"/>
				</td>
			</tr>
		</table>
	</form>
</div>