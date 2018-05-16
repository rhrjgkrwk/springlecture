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
		<h1>File List</h1>
		<table class="table table-striped">
			<tr>
				<th>file name</th>
			</tr>

			<%
			int pagenum;
				if(request.getAttribute("pagenum")==null) pagenum=1;
				else pagenum = Integer.parseInt((String)request.getAttribute("pagenum"));
				String[] fileList = (String[]) request.getAttribute("fileList");
				for (int i = (pagenum - 1) * 10; i < fileList.length && i < pagenum * 10; i++) {
			%>
			<tr>
				<td><a
					href="<%=request.getContextPath() + "\\downloadresult.file?filename=" + fileList[i]%>"><%=fileList[i] + " 다운로드"%></a>
				</td>
			</tr>
			<%
				}
			%>
		</table>
		<ul class="pagination">
			<%
				int totalPage = fileList.length / 10;
				for (int i = 1; i <= totalPage; i++) {
			%>
			<li class="page-item"><a class="page-link" href="<%=request.getContextPath() + "\\download.file?pagenum=" + i%>"><%=i %></a></li>
			<%
				}
			%>
		</ul>
	</div>


</body>
</html>