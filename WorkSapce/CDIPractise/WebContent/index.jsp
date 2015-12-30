<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<center>
	<form method="get" action="ControllerServlet">
		<table>
			<tr>
				<td>Enter your id:</td>
				<td><input type="text" name="employeeId" id="id"></td>
			</tr>
			<tr>
				<td>Enter your name:</td>
				<td><input type="text" name="employeeName" id="name"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
		<table border="1">
			<tr>
				<td>Id</td>
				<td>Name</td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>