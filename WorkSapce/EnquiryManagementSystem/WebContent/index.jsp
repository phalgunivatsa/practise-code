<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome user</title>
</head>
<body>
	<center>
		<form method="get" action="/LoginActionServlet">
			<h1>Welcome User</h1>
			<table>
				<tr>
					<td>Enter your username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Enter your password:</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="submit"></td>
					<td><a href="Registraton.jsp">Register Yourself</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>