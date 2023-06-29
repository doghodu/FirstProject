<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
		<title>会員登録</title>
	</head>
	<script type="text/javascript">
		$(document).ready(function(){
			$(".cencle").on("click", function(){
				
				location.href = "/login";
						    
			})
			$("#submit").on("click", function(){
				if($("#userId").val()==""){
					alert("IDを入力してください。");
					$("#userId").focus();
					return false;
				}
				if($("#userPass").val()==""){
					alert("PassWordを入力してください。");
					$("#userPass").focus();
					return false;
				}
				if($("#userName").val()==""){
					alert("名前を入力してください。");
					$("#userName").focus();
					return false;
				}
			});
		})
	</script>
	<body>
		<section id="container">
			<form action="/member/register" method="post">
				<div class="form-group has-feedback">
					<label class="control-label" for="userId">ID</label>
					<input class="form-control" type="text" id="userId" name="userId" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="userPass">PassWord</label>
					<input class="form-control" type="password" id="userPass" name="userPass" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="userName">名前</label>
					<input class="form-control" type="text" id="userName" name="userName" />
				</div>
				<div class="form-group has-feedback">
					<button class="btn btn-success" type="submit" id="submit">会員登録</button>
					<button class="cencle btn btn-danger" type="button">取消し</button>
				</div>
			</form>
		</section>
		
	</body>
	
</html>