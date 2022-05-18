package com.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String Firstname = request.getParameter("firstname");
		String Email = request.getParameter("Email");
		String Pass = request.getParameter("pass");

		boolean isError = false;
		String errorMessage = "";
		if (Firstname == null || Firstname.trim().length() == 0) {
			isError = true;
			errorMessage += "Please Enter FirstName<br>";
			request.setAttribute("FirstnameError", "<font color='red'>Please Enter the FirstName</font>");
		} else {
			request.setAttribute("FirstNameValue", Firstname);
		}

		if (Email == null || Email.trim().length() == 0) {
			isError = true;
			errorMessage += "Please Enter Email<br>";
			request.setAttribute("Email", "<font color='red'>Please Enter the Email</font>");
		} else {
			request.setAttribute("EmailValue", "Email");
		}
		if (Pass == null || Pass.trim().length() == 0) {
			isError = true;
			errorMessage += "Please Enter Correct Password<br>";
			request.setAttribute("Password", "<font color='red'>Please Enter the FirstName</font>");
		}
		else
		{
			request.setAttribute("PasswordValue", "Password");
		}
		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		} else {
			
			
			//db insert
			
			
			UserBean user = new UserBean();
			user.setFirstname(Firstname);
			user.setEmail(Email);
			user.setPassword(Pass);
			
			boolean status = new UserDao().insertUser(user);
//			new UserDao().insertUser(user);
//			
//			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
//			rd.forward(request, response);
			
			if(status == true)
			{
				RequestDispatcher rd = request.getRequestDispatcher("ListUserServlet");
				rd.forward(request, response);
				
			}
			else {
				//error
			}
			
		}
	}
}
