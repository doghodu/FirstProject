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
	<input type="hidden" value="${view.seq}" name="seq" id="seq">
	タイトル : <input type="text" placeholder="タイトル" id="subject" name="subject" value="${view.subject}">
	作成者 : <input type="text" placeholder="作成者" id="name" name="name" readonly="readonly" value="${view.name}">
	<div>内容 : <input type="text" placeholder="内容" id="content" name="content" value="${view.content}"></div> 
	<button type="button" onclick="fn_boardUpdate();">登録</button>
</form>
</body>
</html>