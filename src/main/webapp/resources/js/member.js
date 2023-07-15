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

function fn_Register(){
	var id = $("#id").val();
	var password = $("#password").val();
	var name = $("#name").val();
	
	$.ajax({
		type : "POST",
		url : "/member/register",
		data : {id : id, password : password, name : name},
		success: function(data){
			if(data == "Y"){
				alert("登録が完了しました.");
				location.href = "http://localhost:8080/";		
			}else{
				alert("登録が失敗しました。.");
			}
		},
		error: function(data){
			alert("失敗");
			console.log(data);
		}
	});
};