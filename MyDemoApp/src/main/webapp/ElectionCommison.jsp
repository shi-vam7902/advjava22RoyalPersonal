<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Election Commission portal</title>
</head>
<body>
<%
	String a = (String)request.getAttribute("age");
%>
	<form action="ElectionServlet" method="post">
	Citizen Name: <input type="text" name="name"><br>
	Gender : <input type="radio" name="rd" value="Male"> Male <input type="radio" name="rd" value="Male"> Female<br>
	Date of Birth : <input type="date" name="Date"> 
	<button type="submit">Submit</button>
	</form>
	
	<div >
		<%= a == null ?" ":a%>
	</div>
	
</body>
</html>