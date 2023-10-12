<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="insertPhone" method="post" enctype="multipart/form-data">

		<table border="1px">
			<tr>
				<TD>ID:</TD>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name"></td>
			</tr>


			<tr>
				<td>PRICE:</td>
				<TD><input type="text" name="price"></TD>
			</tr>


			<tr>
				<td>DATE:</td>
				<TD><input type="datetime-local" name="date"></TD>
			</tr>


			<tr>
				<td>RAM:</td>
				<td><input type="text" name="ram"></td>
			</tr>

			<tr>
				<td>COLOR:</td>
				<td><input type="text" name="color"></td>
			</tr>


			<tr>
				<td>BATTERY:</td>
				<td><input type="text" name="battery"></td>
			</tr>

			<tr>
				<td>PHOTO:</td>
				<td><input type="file" name="photo"></td>
			</tr>


		</table>

		<input type="submit" value="SUBMIT">



	</form>

</body>
</html>