<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="TryServlet">
		<table>
		<tr>
			<td>Enter your id:</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>Enter your name:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Enter your city:</td>
			<td><input type="text" name="city"></td>
		</tr>
		<tr>
			<td>Enter your state:</td>
			<td><input type="text" name="state"></td>
		</tr>
		<tr>
			<td>Enter your country:</td>
			<td><input type="text" name="country"></td>
		</tr>
		<tr>
			<td>Enter your pincode:</td>
			<td><input type="text" name="pincode"></td>
		</tr>
		<tr>
			<td>Enter your contact:</td>
			<td><input type="text" name="contact"></td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" value="submit"></td>
		</tr>
		</table>
	</form>
</body>
</html>