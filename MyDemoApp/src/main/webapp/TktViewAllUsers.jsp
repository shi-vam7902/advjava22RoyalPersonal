<%@page import="com.bean.TktUserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.UserBean"%>
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
			
				 ArrayList<TktUserBean> users = (ArrayList<TktUserBean>) request.getAttribute("allusers");
				
				for(int i=0;i<users.size();i++)
				{
					int total=0;
					out.println(users.get(i).getName()+"\n");
					out.println(users.get(i).getNumber()+"\n");
					out.println(users.get(i).getCategory()+"\n");
					out.println(users.get(i).getQty()+"\n");
					if(users.get(i).getCategory().equals("gold")){
						total = users.get(i).getQty() * 300;
					}
					out.println(total + "\n");
					
				}
			%>
			

				
</body>
</html>