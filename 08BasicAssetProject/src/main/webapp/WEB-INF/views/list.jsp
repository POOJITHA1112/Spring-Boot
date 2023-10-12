<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table BORDER="">
		<tr>
			<th>ID</th>
			<th>ASSET NAME</th>
			<th>REFERENCE ID</th>
			<th>INSTALLATION DATE</th>
			<th>LAB NAME</th>
			<th>OWNER NAME</th>
			<th>IMAGE</th>
			<th>ACTION</th>
		</tr>


		<c:forEach items="${asset}" var="a">
		<tr>
		<td><c:out value="${a.id}"></c:out></td>
		<td><c:out value="${a.assetName}"></c:out></td>
		<td><c:out value="${a.refId}"></c:out></td>
		<td><c:out value="${a.installationDate}"></c:out></td>
		<td><c:out value="${a.labName}"></c:out></td>
		<td><c:out value="${a.ownerName}"></c:out></td>
		<td><img src="/img/${a.photoUrl}" width="50px" height="100px" /></td>
		<td><a href="update?id=${a.id}">UPDATE</a>
		<a href="delete?id=${a.id}">DELETE</a></td>
		</tr>


		</c:forEach>


	</table>


</body>
</html>