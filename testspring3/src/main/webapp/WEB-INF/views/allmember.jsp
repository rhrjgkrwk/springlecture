<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="searchmember">
		<select name="searchcondition">
			<c:forEach var="op" items="${searchconditionlist}">
				<option>${op}</option>
			</c:forEach>
		</select> <input type="text" placeholder="검색어" name="searchword"> <input
			type="submit" value="검색">
	</form>


	<c:forEach var="member" items="${memberlist}">
		${member.id} : ${member.name} : ${member.pw} <br>
	</c:forEach>
</body>
</html>