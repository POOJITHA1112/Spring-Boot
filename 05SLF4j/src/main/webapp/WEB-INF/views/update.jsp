<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<form action="update" method="post">

		<table border="1px">
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" value="${emp.id}"
					readonly="readonly"></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${emp.name}"></td>
			</tr>

			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary" value="${emp.salary}"></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="${emp.email}"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>

		</table>

	</form>

</body>
</html>