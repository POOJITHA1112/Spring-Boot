<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Page</title>
</head>
<body>
	<h3>Add Employee:</h3>
	<a href="./listemp">Go to List Of Employees</a>
	
	<form action="saveemp" method="post">
	
		<table border="1px">

			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>SALARY:</td>
				<td><input type="text" name="salary"></td>
			</tr>


			<tr>
				<td>EMAIL:</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td><input type="submit" value="SUBMIT"></td>
				<td><input type="reset" value="RESET"></td>
			</tr>

		</table>


	</form>

</body>
</html>