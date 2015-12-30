<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
	function loadDoc(){
		alert("Check");
		var xhttp;
		var id = document.getElementById('id').value;
		alert(id);
		//var id=.value.toString();
		if (window.XMLHttpRequest) {
			// code for modern browsers
			xhttp = new XMLHttpRequest();
		} else {
			// code for IE6, IE5
			xhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xhttp.onreadystatechange = function() {
			if (xhttp.readyState == 4 && xhttp.status == 200) {
				document.getElementById("demo").innerHTML = xhttp.responseText;
			}
		}
		xhttp.open("GET", "ControllerServlet?id="+id, true);
		xhttp.send();
	}
</script>

</head>
<body>

	<form>
		<center>
			<table>
				<tr>
					<td>Enter your id:</td>
					<td><input type="text" name="name" id="id"></td>
				</tr>
				<tr>
					<div id="demo">Let AJAX change this text</div>
					<td><button type="button" onclick="loadDoc()">OK</button></td>
				</tr>
			</table>
		</center>
	</form>

</body>
</html>