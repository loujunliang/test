<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人流水</title>
</head>
<body>
	<table border="1px solid red">
		<tr>
			<th>资费ID</th>
			<th>资费名称</th>
			<th>资费状态</th>
			<th>创建时间</th>
			<th>生效时间</th>
			<th>业务类型</th>
		</tr>
		<c:forEach items="${ costs }" var="cost">
			<tr>
				<td>${ cost.id }</td>
				<td>${ cost.name }</td>
				<td>
					<c:if test="${ cost.status==0 }">暂停</c:if>
					<c:if test="${ cost.status==1 }">开通</c:if>
				</td>
				<td>${ cost.createtime }</td>
				<td>${ cost.starttime }</td>
				<td>
					<c:if test="${ cost.type==2 }">临时套餐</c:if>
					<c:if test="${ cost.type==3 }">季度套餐</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>