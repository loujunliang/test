<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品信息</title>
</head>
<body>
	<h1>丹尼斯</h1>
	<table border="1px solid red">
		<tr>
			<th>商品名称</th>
			<th>商品单价</th>
			<th>商品颜色</th>
		</tr>
		<c:forEach items="${ list }" var="mall">
			<tr>
				<td>${ mall.name }</td>
				<td>${ mall.price }</td>
				<td>${ mall.color }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>