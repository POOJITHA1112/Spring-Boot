<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Page</title>
</head>
<body>
	<h2>Get All Employees:</h2>
	
	<a href="./home">Add New user</a>
	
	<table border="1px;">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>EMAIL</th>
			<th>ACTION</th>
		</tr>

		<c:forEach items="${emps}" var="e">

			<tr>
			    <td><c:out value="${e.id}"></c:out></td>
				<td><c:out value="${e.name}"></c:out></td>
				<td><c:out value="${e.salary}"></c:out></td>
				<td><c:out value="${e.email}"></c:out></td>
				<td><a href="updateEmp?id=${e.id}">UPDATE</a>
			        <a href="deleteEmp?id=${e.id}">DELETE</a></td>

			</tr>

		</c:forEach>



	</table>

</body>
</html>