<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Contact</td>
			<td>Address</td>
		</tr>
		<tr>
			<td>${showEmployee.id}</td>
			<td>${showEmployee.name}</td>
			<td>${showEmployee.contact}</td>
			<td>${showEmployee.address}</td>
		</tr>
</table>
</center>		
</body>
</html>