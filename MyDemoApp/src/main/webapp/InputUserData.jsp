<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InputData Jsp</title>
</head>
<body>	
	<form action="InputDataServlet" method="post">
	FirstName : <input type="text" name="firstName"><br>
	Credit Card : <input type="text" name="cc"> <br>
	<input type="submit" value="buy now">
	</form>
	
</body>
</html>