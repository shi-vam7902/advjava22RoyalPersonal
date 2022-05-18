package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet  extends HttpServlet{
	@Override
	public void service(HttpServletRequest request , HttpServletResponse response) {
		 String Email = request.getParameter("Email");
		 String password = request.getParameter("pass");
		 
		 System.out.println(Email);
		 System.out.println(password);
		 
		 try {

			 PrintWriter out = response.getWriter();
			 out.print("<html><body>");
			 out.print("Email "+Email + "<br>");
			 out.print("Password "+password + "<br>");
			 out.print("</html></body>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
