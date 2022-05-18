package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest request ,HttpServletResponse response)
	{
		String firstname = request.getParameter("FirstName");
		String lastname = request.getParameter("LastName");
		String password = request.getParameter("pass");
		String email = request.getParameter("email");
		String gender = request.getParameter("rd");
		String Hobby = request.getParameter("hn");
		String City = request.getParameter("city");
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(password);
		
		response.setContentType("text/html");
		
		try {
			PrintWriter out = response.getWriter();
			
			out.print("<html><body>");
			out.print("FirstName: "+firstname +"<br>");
			out.print("LastName : "+lastname +"<br>");
			out.print("Email: "+email+"<br>");
			out.print("Password: "+password+"<br>");
			out.print("Gender: "+gender+"<br>");
			out.print("Hobbies are :-"+" Eat"+"<br>");
			out.print("City Selcted is ;-"+City+"<br>");
			out.print("</html></body>");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
