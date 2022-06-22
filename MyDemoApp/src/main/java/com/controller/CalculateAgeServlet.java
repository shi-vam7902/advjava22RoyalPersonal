package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateAgeServlet")
public class CalculateAgeServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bYear = request.getParameter("bYear");// html data --> read -->string
		int year = Integer.parseInt(bYear);

		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		int age = currentYear - year;

		// age -> send
		request.setAttribute("age", age);
		// FO.jsp
		RequestDispatcher rd = request.getRequestDispatcher("FilterOutput.jsp");
		rd.forward(request, response);

	}
}