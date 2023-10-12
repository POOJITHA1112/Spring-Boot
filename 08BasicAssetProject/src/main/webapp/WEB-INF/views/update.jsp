<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateEmp" method="post">

		<table>

			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" value="${as.id}"
					readonly="readonly"></td>
			</tr>

			<tr>
				<td>ASSET NAME:</td>
				<td><input type="text" name="assetName" value="${as.assetName}"></td>
			</tr>

			<tr>
				<td>REFERENCE ID:</td>
				<td><input type="text" name="refId" value="${as.refId}"></td>
			</tr>

			<tr>
				<td>INSTALLATION DATE:</td>
				<td><input type="date" name="installationDate"
					value="${as.installationDate}"></td>
			</tr>

			<tr>
				<td>LAB NAME:</td>
				<td><input type="text" name="labName" value="${as.labName}"></td>
			</tr>

			<tr>
				<td>OWNER NAME:</td>
				<td><input type="text" name="ownerName" value="${as.ownerName}"></td>
			</tr>


			<tr>
				<td><input type="submit" value="update"></td>
			</tr>

		</table>




	</form>

</body>
</html>