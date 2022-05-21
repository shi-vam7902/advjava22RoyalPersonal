<%@page import="com.dao.UserStorage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>
<h1>Listing all Bhaio and behno</h1>

<%
	for(int i=0;i<UserStorage.users.size();i++)
	{
		out.println(UserStorage.users.get(i).getFirstName()+"<br>");
	}
%>
</body>
</html>