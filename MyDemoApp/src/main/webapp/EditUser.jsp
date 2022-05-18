<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<%
			UserBean user = (UserBean) request.getAttribute("user");
			
		%>
	<form action="UpdateServlet" method="post">
	Email : <input type="text" name="email" value="<%=user.getEmail() == null ? "" :user.getEmail()%>"> 
	FirstName: <input type="text" name="firstname" value="<%=user.getFirstname() == null ? "" :user.getFirstname()%>">
	<input type="hidden" name ="userid" value="<%= user.getUserid() %>">
	<button type="Submit">Submit</button> 
	</form>
</body>
</html>