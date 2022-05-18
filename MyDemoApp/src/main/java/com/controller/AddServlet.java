package com.controller;
import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void service (HttpServletRequest request, HttpServletResponse response)
	{
		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");
		
		
		response.setContentType("text/html");
		
		try {
			
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("Number1 : "+num1 + "<br>");
			out.print("Number2 : "+num2+ "<br>");
			out.print("The Addition of no 1 :"+num1);
			out.print("</html></body>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
