<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			String FirstnameError = (String)request.getAttribute("FirstnameError");		
			String EmailError = (String)request.getAttribute("Email");
			String PasswordError = (String)request.getAttribute("Password");
			String FirstNameValue = (String)request.getAttribute("FirstNameValue");
			String Emailvalue = (String)request.getAttribute("EmailValue");
			String PasswordValue = (String)request.getAttribute("PasswordValue");
		%>
		<form method="post" action="RegistrationServlet">
		
		FirstName : <input type="text" name="firstname"
		 value="<%=FirstNameValue == null ? "" : FirstNameValue%>">
		<%=FirstnameError == null ? "":FirstnameError%>
		<br><br>
		
		Email :  <input type="text" name="Email" 
		value="<%=Emailvalue == null ? "" :Emailvalue%>">
		<%= EmailError == null ? "":EmailError%>
		<br><br>
		
		Password: <input type="text" name="pass">
		<%= PasswordError == null ? "":PasswordError%>
		<br><br>
		<button type="submit" name="submit">Submit</button>
	</form>
</body>
</html>