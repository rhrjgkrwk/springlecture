<%@page import="multi.edu.mvcannotation.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Login Result</title>
</head>
<body>
	<h1>로그인 결과!</h1>
<%-- 	<c:if test="${empty sessionScope.sessionid}"> --%>
<%-- 	${param.id}님 로그인부터해여 --%>
<%-- 	</c:if> --%>
<%-- 	<c:if test="${not empty sessionScope.sessionid}"> --%>
<%-- 	${sessionid}님 환영한다. --%>
<%-- 	</c:if> --%>
	<br>
	result :
	${result}
	<br>
	vo.id :
	${vo.id}
	
	
<!-- 	spring container 가 알아서 객체를 넘겨준다... -->
<!-- 	VO 클래스 이름 앞글자만 소문자로 바꾼 형태로... -->
	<br>
	loginVO.id : 
	${loginVO.id} 
	<br>
	myobj : ${myobj.id}
</body>
</html>