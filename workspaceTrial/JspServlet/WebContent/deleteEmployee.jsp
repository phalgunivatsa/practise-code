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
	<form action="CRUDServlet" method="get">
		<table>
			<tr>
			<td>Enter the id you want to delete</td>
			<td><input type= "text" name="deleteById"></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" value="Delete" name="choice"/></center></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>