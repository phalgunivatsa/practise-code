<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<center>
		<form method="get" action="RegistrationActionServlet">
			<h2>REGISTER</h2>
			<table>
				<tr>
					<td>Enter your name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
				<tr>
					<td>Enter your emailId:</td>
					<td><input type="text" name="emailId"></td>
				</tr>
				<tr>
				<tr>
					<td>Enter your username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
				<tr>
					<td>Enter your password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Enter your type:</td>
					<td><input type="text" name="type"></td>
				</tr>
				<tr>
					<td>Enter your status:</td>
					<td><input type="text" name="status"></td>
				</tr>
				<tr>
					<td><input type="Submit" name="Submit" value="submit"></td>

				</tr>
			</table>
		</form>
	</center>

</body>
</html>