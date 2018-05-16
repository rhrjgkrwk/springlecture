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
	<h1>board write</h1>
	<div class="container">
		<form action="write" method="post" enctype="multipart/form-data">
		<table class="table table-striped">
			<tr>
				<th>name</th>
				<td><input class="form-control" type="text" placeholder="name" name="name"></td>
			</tr>
			<tr>
				<th>title</th>
				<td><input type="text" class="form-control" placeholder="title" name="title"></td>
			</tr>
			<tr>
				<th>content</th>
				<td>
				<textarea class="form-control" rows="10" cols="100" name="content" ></textarea>
				</td>
			</tr>
			<tr>
				<th>file</th>
				<td>
				<input type="file" name="file">
				</td>
			</tr>
		</table>
		<input type="submit" class="btn btn-danger" value="등록">
		</form>
	</div>
</body>
</html>