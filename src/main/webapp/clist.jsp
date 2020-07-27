<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<table>
		<tr>
			<td>序号</td>
			<td>名称</td>
			<td>文章数量</td>
			<td>操作</td>
		</tr>
	 <c:forEach items="${list}" var="c">
	 	<tr>
	 		<td>${c.cid}</td>
	 		<td>${c.cname}</td>
	 		<td>${c.bcound}</td>
	 		<td>
	 			<a href="">	 			
		 			<input type="button" value="文章列表">
	 			</a>
	 		</td>
	 	</tr>
	 </c:forEach>
	</table>
</body>
</html>