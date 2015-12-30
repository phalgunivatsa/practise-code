<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="customer" class="com.yash.jsp.domain.Customer" scope="request"/>

ID:<jsp.getProperty property="id" name="customer">
Name:<jsp.getProperty property="name" name="customer">
Address<jsp.getProperty property="address" name="customer">

</body>
</html>