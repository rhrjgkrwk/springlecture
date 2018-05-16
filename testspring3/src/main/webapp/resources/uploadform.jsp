<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
	text-align: center;
}
.container{
	width : 30%;
	
}
form{
	margin: 15px auto;
	width : 30%;
	text-align: center;
}
.btns{
	width: 100%;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<h1>FILE UPLOAD</h1>
<div class="container">
	<form action='<%=request.getContextPath()+"/upload.file"%>' method="post" enctype="multipart/form-data">
	<input class="form-control" type="text" name="name" placeholder="전송자 이름">
	<input class="form-control" type="text" name="description" placeholder="설명">
	<input class="form-control" type="text" name="filename" placeholder="파일 명">
	<input class="btns btn btn-danger" type="file"  name="fileupload">
	<input class="btns btn btn-danger" type="submit" value="파일 전송">
	</form>
</div>
</body>
</html>