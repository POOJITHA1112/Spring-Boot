<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <a href="./listEmps">Go to List of Assets</a>

	<form action="saveEmp" method="post" enctype="multipart/form-data">
	<table border="1px">
	
	<tr>
	<td>ID:</td>
	<td><input type="text" name="id"></td>
	</tr>
	
	<tr>
	<td>NAME:</td>
	<td><input type="text" name="assetName"></td>
	</tr>
	
	<tr>
	<td>REFERENCE ID:</td>
	<td><input type="text" name="refId"></td>
	</tr>
	
	<tr>
	<td>INSTALLATION DATE</td>
	<td><input type="date" name="installationDate"></td>
	</tr>
	
	<tr>
	<td>LAB NAME</td>
	<td><input type="text" name="labName"></td>
	</tr>
	
	<tr>
	<td>OWNER NAME</td>
	<td><input type="text" name="ownerName"></td>
	</tr>
	
	<tr>
	<td>PHOTO:</td>
	<td><input type="file" name="photo">
	</td>
	
	<tr>
	<td><input type="submit" value="SUBMIT"></td>
	</tr>
	
	
	</table>
	</form>

</body>
</html>