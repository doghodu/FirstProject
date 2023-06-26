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
<input type="hidden" value="${view.seq}" name="seq" id="seq">　　<!-- 이것에 용도 문의하기 6번 문제 해결 함 -->
<div>タイトル : ${view.subject} アクセス数 : ${view.readCount}</div>
<div>作成者 : ${view.name}</div>
<div>内容 : ${view.content} </div>
<button type="button" onclick='location.href="/board/list"'>目録</button>
<button type="button" onclick='fn_goUpdateView(${view.seq})'>修正</button>
<button type="button" onclick='fn_boardDelete(${view.seq})'>削除</button>
</form>
</body>
</html>