package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ElectionServlet")
public class ElectionServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				String name = request.getParameter("name");
				String gender = request.getParameter("rd");
				String date =  request.getParameter("date");
				
				int dob = Integer.parseInt(date.substring(0,4));
				Calendar c =  Calendar.getInstance();
				int year = c.get(c.YEAR);
				
				
				int age  = year - dob;
				
				if(age > 18)
				{
					request.setAttribute("age", name +"You are  eligible");
				}
				else
				{
					request.setAttribute("age", name+"You are not eligible");
				}
				
			RequestDispatcher rd = request.getRequestDispatcher("ElectionCommision.jsp");
			rd.forward(request, response);

				
				
				
				
				
	}
}
