<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>LoginForm</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
	h1{
		text-align: center;
	}
	#fm{
		width: 20%;
		margin: 20px auto;
	}
	.login-btn{
		width: 100%;
	}
</style>

</head>
<body>
	<h1>Log In</h1>
	<form id="fm" class="input-group" action="login" method="post">
		<input class="form-control" type="text" name="id"> <input
			class="form-control" type="password" name="pw"> <input
			class="btn btn-danger login-btn" type="submit" value="login">
	</form>
</body>
</html>