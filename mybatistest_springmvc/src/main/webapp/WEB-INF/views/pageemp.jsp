<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<style>
table {
	/* border: solid 2px blue; */
	
}

td {
	border: solid 1px blue;
}
</style>
</head>

<body>
	<form action="/firstmybatis/searchemp">
		검색 컬럼 <select name="searchcolumn">
			<option>department_id</option>
			<option>hire_date</option>
			<option>employee_id</option>
		</select> 검색어 <input type="text" name="searchword"> <input
			type="submit" value="검색">
	</form>

	<table>
		<c:if test="${empty res}">
			<c:forEach items="${emplist}" var="emp">
				<tr>
					<td>${emp}</td>
				</tr>
			</c:forEach>
		</c:if>

		<c:if test="${!empty res}">
			<c:forEach items="${res}" var="emp">
				<tr>
					<td>${emp}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<c:forEach var="page" begin="1" end="${totalPage}">
		<a href="/firstmybatis/pageallemp?pagenum=${page}">${page}</a>&nbsp;
	</c:forEach>

</body>
</html>