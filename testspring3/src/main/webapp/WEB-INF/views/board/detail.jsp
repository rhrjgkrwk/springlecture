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
<script type="text/javascript">
	$('document').ready(function (){
		$('#delete-btn').on('click', function(){
			var flag = confirm("정말 삭제하겠니?");
			if(flag){
				location.href='delete?idx=${boardVO.idx}';
			}			
		});
		$('#edit-btn').on('click', function(){
			location.href='edit';
		});
	});
</script>
<body>
	<h1>board detail</h1>
	<div class="container">
		<table class="table table-striped">
			<tr>
				<th>idx</th>
				<td>${boardVO.idx}</td>
			</tr>
			<tr>
				<th>name</th>
				<td>${boardVO.name}</td>
			</tr>
			<tr>
				<th>title</th>
				<td>${boardVO.title}</td>
			</tr>
			<tr>
				<th>content</th>
				<td>${boardVO.content}</td>
			</tr>
			<tr>
				<th>file</th>
				<td>
				<a href="<%=request.getContextPath() %>\\board.file?filename=${boardVO.file_name}">${boardVO.file_name}</a>
				</td>
			</tr>
		</table>
		<a id="delete-btn" class="btn btn-danger" href="#">삭제</a>
		<a id="edit-btn" class="btn btn-danger" href="edit?idx=${boardVO.idx}">수정</a>
	</div>
</body>
</html>