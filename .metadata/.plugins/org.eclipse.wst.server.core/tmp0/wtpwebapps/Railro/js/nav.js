$(function(){
	
	$('a').attr('href', 'javascript:void(0)');
	
	// 메뉴에 마우스 오버 했을 때 서브 메뉴 나타냄
	$("ul.top-menu li").hover(function() {
	 
		$("ul:not(:animated)",this).slideDown("fast");
	 
	}, function(){
		 
		$("ul",this).slideUp("fast");
		 
	});
			
})