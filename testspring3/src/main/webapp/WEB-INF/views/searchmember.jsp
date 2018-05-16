<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="searchmember">
<select class="form-control" name="searchcondition">
	<c:forEach var="op" items="${searchconditionlist}" >
		<option>${op}</option>
	</c:forEach>
</select>
<input class="form-control" type="text" placeholder="검색어" name="searchword">
<input class="btn btn-danger" type="submit" value="검색">
</form>


<table class="table">
<tr>
	<th>id</th>
	<th>name</th>
	<th>pw</th>
</tr>

<c:forEach var="vo" items="${memberlist}" >
<%-- 	<br> ${vo.id} : ${condition} : ${word}  --%>
	<c:if test="${condition==\"id\" && vo.id.indexOf(word) >=0}">
		<tr>
		<td>${vo.id}</td>
	<td>${vo.name}</td>
	<td>${vo.pw}</td>
		</tr>
	</c:if>
	<c:if test="${condition==\"name\" && vo.name.indexOf(word) >=0}">
		<tr>
		<td>${vo.id}</td>
	<td>${vo.name}</td>
	<td>${vo.pw}</td>
		</tr>
	</c:if>
	<c:if test="${condition==\"pw\" && vo.pw.indexOf(word) >=0}">
		<tr>
		<td>${vo.id}</td>
	<td>${vo.name}</td>
	<td>${vo.pw}</td>
		</tr>
	</c:if>
</c:forEach>

</table>
</body>
</html>