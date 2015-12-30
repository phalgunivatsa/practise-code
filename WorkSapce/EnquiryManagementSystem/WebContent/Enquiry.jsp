<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form method="get">
			<h2>Enquiry</h2>
			<table>
				<tr>
					<td>Enter name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
				<tr>
					<td>Enter emailId:</td>
					<td><input type="text" name="emailid"></td>
				</tr>
				<tr>
				<tr>
					<td>Enter contact:</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>Enter courses</td>
					<td><input type="checkbox" NAME="hobbies" value="Database">Database
						<input type="checkbox" NAME="hobbies" value="Core Java">CoreJava 
						<input type="checkbox" NAME="hobbies" value="Servlet">Servlet
					</td>
				<tr>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>