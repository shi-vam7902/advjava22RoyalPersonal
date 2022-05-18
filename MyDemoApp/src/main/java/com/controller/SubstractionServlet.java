package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubstractionServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		int no1 = Integer.parseInt(n1);
		int no2 = Integer.parseInt(n2);
		int sub = no1-no2;
		
		
		request.setAttribute("Answer", sub);
		RequestDispatcher rd = request.getRequestDispatcher("SubstractionAns.jsp");
		rd.forward(request, response);
	
}
}