function check(){
	var id = joinform.ID.value;
	var pwd = joinform.PWD.value;
	var pwd_ck = joinform.PWD_CK.value;	
	var email = joinform.EMAIL.value;
	var birth = joinform.YEAR.value + joinform.MONTH.value + joinform.DAY.value;
	var gender = joinform.GENDER.value;
	var interest = joinform.INTEREST.value;
	var phone = joinform.PHONE.value;
	var address = joinform.MEMBER_ADDRESS.value;
	
	var forms = document.getElementById("joinform");

	if ((forms.NAME.value=="")||(forms.NAME.value.length<=1)){
		alert("이름을 제대로 입력해 주세요.");
		forms.NAME.focus();
        return false;
	}
	if(id.length == 0){
		alert("아이디를 입력하세요.");
		joinform.ID.focus();
		return false;
	}
	if(pwd.length == 0){
		alert("비밀번호를 입력하세요.");
		joinform.PWD.focus();
		return false;
	} 
	if(pwd != pwd_ck){
		alert("비밀번호가 일치하지 않습니다.");
		joinform.PWD.value="";
		joinform.PWD_CK.value="";
		joinform.PWD.focus();
		return false;
	}
	if((forms.YEAR.value=="")||(forms.MONTH.value=="")||(forms.DAY.value=="")||(forms.YEAR.value.length<4)){
		alert("생년월일을 제대로 입력하세요.");
      	forms.YEAR.focus();
        return false;
 	}
	if(email.length == 0){
		alert("이메일을 제대로 입력하세요.");
		joinform.EMAIL.focus();
		return false;
	}
	if(phone.length == 0){
		alert("휴대폰 번호를 입력하세요.");
		joinform.PHONE.focus();
		return false;
	} 
	if((forms.ZIPCODE1.value=="")||(forms.ZIPCODE1.value.length<3)){
		alert("우편번호 앞의 3자리를 입력해 주세요.");
      	forms.ZIPCODE1.focus();
        return false;
 	}
 	if((forms.ZIPCODE2.value=="")||(forms.ZIPCODE2.value.length<3)){
		alert("우편번호 뒤의 3자리 입력해 주세요.");
      	forms.ZIPCODE2.focus();
        return false;
	}  
	if(address.length == 0){
		alert("주소를 입력하세요.");
		joinform.ADDRESS.focus();
		return false;
	} 
	alert("성공")
	return true;
}

function openConfirmId(joinform){			
	var id = joinform.ID.value;
	var url="idCheck.htm";
	
	if(id.length == 0){
		alert("아이디를 입력하세요.");
		joinform.ID.focus();
		return false;
	}
	open(url, "confirm", "toolbar=no,location=no,status=no,menubar=no,"+
						 "scrollbars=no,resizable=no,width=400,height=200");
}

function openZipcode(joinform){			
	var url="zipcode.htm"
	open(url, "confirm", "toolbar=no,location=no,"
						+"status=no,menubar=no,"
						+"scrollbars=yes,resizable=no,"
						+"width=410,height=400");
}	

function gNumCheck(){
	if(event.keyCode >=48 && event.keyCode <=57) {
		return true;
	}else{
		event.returnValue=false;	
	}
}