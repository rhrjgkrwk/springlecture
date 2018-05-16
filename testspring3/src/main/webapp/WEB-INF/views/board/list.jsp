<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h1>board list</h1>
		<table class="table table-striped">
			<tr>
				<th>idx</th>
				<th>title</th>
				<th>name</th>
				<th>file</th>
			</tr>
			<c:forEach var="boardVO" items="${boardList}">
				<tr>
					<td>${boardVO.idx}</td>
					<td><a href="detail?idx=${boardVO.idx}">${boardVO.title}</a></td>
					<td>${boardVO.name}</td>
					<td>${boardVO.file.originalFilename}</td>
				</tr>
			</c:forEach>
		</table>
		<a id="write-btn" class="btn btn-danger" href="write">글 등록</a>
	</div>
</body>
</html>