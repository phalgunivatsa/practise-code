<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="/jstlpractise" prefix="jp"%>
	
<body>
	<center>
	<form method="get" action="JsltServlet">
	<table>
		<tr>
		<td>Enter your id:</td>
		<td><jp:form type="text" name="id" value="" /></td>
	</tr>
	<tr>
		<td>Enter you name</td>
		<td><jp:form type="text" name="name" value="" /></td>
	</tr>
	<tr>
		<td>Enter your address</td>
		<td><jp:form type="text" name="address" value=""/></td>
		</tr>
	<tr>
	<td><input type="Submit" value="Submit"></td>
	</form>
	</center>
</body>
</html>