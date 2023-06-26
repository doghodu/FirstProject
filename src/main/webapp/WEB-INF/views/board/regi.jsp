<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="${path}/resources/js/board.js"></script>
<title>Insert title here</title>
</head>
<body>
<form id="frm">
<input type="text" placeholder="タイトル" id="subject" name="subject">
<input type="text" placeholder="作成者" id="name" name="name">
<input type="text" placeholder="内容" id="content" name="content"> 
<button type="button" onclick="fn_boardRegi();">登録</button>
</form>
</body>
</html>