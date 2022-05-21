<%@page import="com.dao.TtkUserStorage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
This is the all Users List
</h2>

			<%
				for(int i=0;i<TtkUserStorage.users.size();i++)
				{
					out.println(TtkUserStorage.users.get(i).getName()+"\n");
					out.println(TtkUserStorage.users.get(i).getNumber()+"\n");
					out.println(TtkUserStorage.users.get(i).getCategory()+"\n");
					out.println(TtkUserStorage.users.get(i).getQty()+"\n");
					
				}
			%>
			

				
</body>
</html>