<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing All Users</title>
</head>
<body>
	<%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("AllUsers");
	%>



	<table border="2" align="center">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
			<th>View</th>
			<th>Edit</th>
		</tr>

		<tr>
			<%
			for (UserBean user : users) {
			%>

			<td><%=user.getUserid()%></td>
			<td><%=user.getFirstname()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getPassword()%></td>
			<td><a href="DeleteUserServlet?Userid=<%=user.getUserid()%>">Delete</a> |
			<td><a href="ViewUserServlet?Userid=<%=user.getUserid()%>">View</a> </td> |
			<td><a href ="EditUserServlet?Userid=<%=user.getUserid()%>">Edit</a></td>
			
			</td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>