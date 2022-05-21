<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket SignUp </title>
</head>
<body>
<h1>Welcome To Ticket Booking System</h1>
 	<form action="TktServlet" method="post">
 		Name : <input type="text" name="name"><br><br>
 		Mobile No: <input type="text" name="number"><br><br>
 		Category : <select name="category">
 			<option  value="gold">Gold -- 300</option>
 			<option  value="silver">Silver -- 200</option>
 			<option  value="platinum">Platinum -- 350</option>
 		</select> <br><br>
 		Quantity : <input type="text" name="qty"><br><br>
 		<button type="submit" name="submit">Submit</button>
 		<a href="TktViewAllUsers.jsp">ViewAllUsers</a>
 	</form>
</body>
</html>