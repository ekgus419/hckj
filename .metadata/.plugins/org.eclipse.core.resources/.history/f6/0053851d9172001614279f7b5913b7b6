function check(){
	var id = loginform.ID.value;
	var pwd = loginform.PWD.value;
	
	if(id.length == 0){
		alert("아이디를 입력하세요.");
		loginform.ID.focus();
		return false;
	}
	if(pwd.length == 0){
		alert("비밀번호를 입력하세요.");
		loginform.PWD.focus();
		return false;
	}
	
	return true;
}

function openConfirmId(loginform){	
	var url="findMyIdPwd.htm";
	open(url, "confirm", "toolbar=no,location=no,status=no,menubar=no,"+
						 "scrollbars=no,resizable=no,width=450px,height=300");
}