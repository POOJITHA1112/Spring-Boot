<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatePhone" method="post">

<table>
 <tr>
 <td>ID:</td>
 <td><input type="text"  name="id" value="${p.id}" id="id" readonly="readonly"></td>
 </tr>
 
  <tr>
  <td>NAME:</td>
  <td><input type="text" name="name" value="${p.name}"></td>
  </tr>
  
  <tr>
  <td>PRICE:</td>
  <td><input type="text" name="price" value="${p.price}"></td>
  </tr>
  
  <tr>
  <td>DATE:</td>
  <td><input type="date" name="date" value="${p.date}"></td>
  </tr>
  
  
  <tr>
  <td>RAM:</td>
  <td><input type="text" name="ram" value="${p.ram}"></td>
  </tr>
  
  <tr>
  <td>COLOR:</td>
  <td><input type="text" name="color" value="${p.color}"></td>
  </tr>
  
  <tr>
  <td>BATTERY:</td>
  <td><input type="text" name="battery" value="${p.battery}"></td>
  </tr>
  
  
</table>

<input type="submit" value="UPDATE">
<input type="reset" value="RESET">

</form>


</body>
</html>