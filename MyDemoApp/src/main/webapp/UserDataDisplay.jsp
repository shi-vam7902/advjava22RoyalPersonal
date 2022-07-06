<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserData</title>
</head>
<body>
	
 FirstName =>  ${cookie.firstName.value }
 Cc => ${sessionScope.cc}

<a href="LogoutServlet">Logout</a>
</body>
</html>