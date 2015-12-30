<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Enquiry</title>
</head>
<body>
<center>
<h2>Add Employee</h2>
<form action="CRUDServlet" method="GET">
	<table>
		<tr>
			<td>Id</td>
			<td><input type= "text" name="id"></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type= "text" name="name"></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><input type= "text" name="contact"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><input type= "text" name="address"></td>
		</tr>
		<tr>
		<td><input type="submit" value="Add" name="choice" id="add"/></td>
		</tr>
	</table>
</form>
</center>
</body>
</html>