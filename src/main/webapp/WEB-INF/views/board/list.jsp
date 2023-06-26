<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${path}/resources/css/test.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="${path}/resources/js/board.js"></script>
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form id="frm">
<div class="container">
	<input type="hidden" value="" name="seq" id="seq">
	<h1 class="mt-5 mb-3">掲示板リスト</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>番号</th>
				<th>タイトル</th>
				<th>内容</th>
				<th>作成者</th>
				<th>日付</th>
				<th>アクセス数</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
	 			<tr>
	 			 	 <td>${list.seq}</td>
	  				 <td><a href="#" onclick="fn_goView(${list.seq})">${list.subject}</a></td>
					 <td>${list.content}</td>
	 				 <td>${list.name}</td>
	 				 <fmt:parseDate value="${list.reg_date}" var="dateValue" pattern="yyyyMMddHHmmss"/> 
	 				 <td><fmt:formatDate value="${dateValue}" pattern="yyyy-MM-dd"/></td>
	 				 <td>${list.readCount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button type="button" onclick="location.href='/board/regiView'">書込み</button>
	</div>
</form>
</body>
</html>