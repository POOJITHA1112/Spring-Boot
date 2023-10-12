<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv=”Permissions-Policy” content=”interest-cohort=()”>
</head>
<body>

	<a href="./insert">ADD PHONE DETAILS</a>
	<br>
	<br>


	<table border="1px">
		<tr>
			<th>ID:</th>
			<TH>NAME:</TH>
			<TH>PRICE:</TH>
			<TH>DATE OF PURCHASE:</TH>
			<TH>RAM:</TH>
			<TH>COLOR:</TH>
			<TH>BATTERY:</TH>
			<TH>Image</TH>
			<TH>ACTION</TH>
		</tr>

		<c:forEach items="${phones}" var="p">

			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td>${p.date}</td>
				<td>${p.ram}</td>
				<td>${p.color}</td>
				<td>${p.battery}</td>
				<td><img src='/img/${p.photoUrl}' width="50px" height="100px" /></td>
				<td><a href="updatep?id=${p.id}">UPDATE</a> <a
					href="deletep?id=${p.id}">DELETE</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>