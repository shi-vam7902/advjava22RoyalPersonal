<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission Portal</title>
</head>
<body>
	<h1>Welcome to Admission Portal</h1>
	<h2 align="center">Please Enter all The Three Subject Marks for Your Eligiblity</h2>
	<form action="AdmissionPortalServlet" method="post">
		Mathematics:<input type="text" name="maths">${error}<br>
		Pyhsics:<input type="text" name="physics">${error}<br>
		Chemistry:<input type="text" name="chemistry">${error}<br>
		
		<input type="submit">
		
	</form>
</body>
</html>