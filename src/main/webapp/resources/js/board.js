function fn_boardRegi(){
	var subject = $("#subject").val();
	var name = $("#name").val();
	var content = $("#content").val();
	
	$.ajax({
		type : "POST",
		url : "/board/regi",
		data : {subject : subject, name : name, content : content},
		success: function(data){
			if(data == "Y"){
				alert("書き込み登録が完了しました.");
				location.href = "/board/list";		
			}else{
				alert("書き込み登録が失敗しました。.");
			}
		},
		error: function(data){
			alert("失敗");
			console.log(data);
		}
	});
};

function fn_boardUpdate(){
	var seq = $("#seq").val();
	var subject = $("#subject").val();
	var name = $("#name").val();
	var content = $("#content").val();

	$.ajax({
		type : "POST",
		url : "/board/update",
		data : {seq: seq, subject : subject, name : name, content : content},
		success: function(data){
			if(data == "Y"){
				alert("書き込みの修正が完了しました。");
				fn_goView(seq);
			}else{
				alert("書き込みの修正が失敗しました。.");
			}
		},
		error: function(data){
			alert("失敗");
			console.log(data);
		}
	});
}

function fn_boardDelete(seq){
	$.ajax({
		type : "POST",
		url : "/board/delete",
		data : {seq: seq},
		success: function(data){
			if(data == "Y"){
				alert("書き込みの削除が完了しました。.");
				location.href = "/board/list";		
			}
		},
		error: function(data){
			alert("失敗");
			console.log(data);
		}
	});
}

function fn_goView(seq){
	$("#seq").val(seq);

	var f = $("#frm");
	f.attr("action", "/board/view");
	f.attr("method", "POST");
	f.submit();
};

function fn_goUpdateView(seq){
	$("#seq").val(seq);

	var f = $("#frm");
	f.attr("action", "/board/goUpdateView");
	f.attr("method", "POST");
	f.submit();
};