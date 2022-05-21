<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Manager</title>
</head>
<body>
	<form action="ExpenseServlet" method="post">
	FirstName : <input type="text" name="firstname"><br><br>
	Email : <input type="text" name="email"><br><br>
	Password: <input type="password" name="password"><br><br>
	Gender: Male <input type="radio" name="gender" value="male" >
	Female :<input type="radio" name="gender" value="female" >
	<input type="submit" value="Save User">
	</form>
</body>
</html>