<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> intl Input</title>
</head>
<body>
	<form action="ElProcess.jsp">
		Name : <input type="text" name="name"><br><br>
		Age : <input type="text" name="age"><br><br>
		<input type="submit">
	</form>
	<c:set var="name" value="Shivam"></c:set>
</body>
</html>