function fn_login(){
	var id = $("#id").val();
	var password = $("#password").val();
	
	$.ajax({
		type : "POST",
		url : "/member/login",
		data : {id : id, password : password},
		success: function(data){
			if(data == "Y"){
				location.href = "/board/home";		
			}else{
				alert("IDまたはPassWordが一致しないです。");
			}
		},
		error: function(data){
			alert("IDまたはPassWordが一致しないです。");
		}
	});
};

