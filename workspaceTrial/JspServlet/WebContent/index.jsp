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
	<h2>Employee Page </h2>
	<form action="CRUDServlet" method="get">
		<table border="1 solid">
			<tr>
				<td colspan="2">Search by Id</td>
				
				<td colspan="2"><input type= "text" name="searchById"></td>
			</tr>
			<tr>
				<td><input type= "submit" value="Search" name="choice"></td>
				<td><a href= "addEmployee.jsp">Add</a></td>
				<td><a href="deleteEmployee.jsp">Delete</a></td>
				<td><a href="updateEmployee.jsp">Update</a></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>