<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>掲示板HOME</title>
    <!-- Bootstrap CSS 링크 -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form id="frm">
    <div class="container">
        <h1 class="mt-5">掲示板</h1>
        <hr>
        <div class="row">
            <div class="col-md-6">
               <a href="/board/list">掲示板リスト</a>
            </div>
        </div>
    </div>
</form>
</body>
</html>