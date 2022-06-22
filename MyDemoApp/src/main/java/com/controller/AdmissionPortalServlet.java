package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/AdmissionPortalServlet")
public class AdmissionPortalServlet extends HttpServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	int maths =  Integer.parseInt(request.getParameter("maths"));
	int physics =  Integer.parseInt(request.getParameter("physics"));
	int chemistry =  Integer.parseInt(request.getParameter("chemistry"));
	int total = maths + physics + chemistry;
	
	
	System.out.println("Maths:->"+maths);
	System.out.println("physics"+physics);
	System.out.println("chemistry"+chemistry);
	System.out.println(total);
	
	
	
	if(maths >= 60 && physics >=50 && chemistry >= 40 )
	{
		if( total >=200)
		{	
		request.setAttribute("success", "Your Admission is confirmed");
		RequestDispatcher rd = request.getRequestDispatcher("AdmissionAdvanceOutput.jsp");
		rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("AdmissionAdvance.jsp");
			rd.forward(request, response);
			System.out.println("in  inner if");
		}
			
		
	}
	else
	{
		request.setAttribute("error", "Please Enter the Correct Marks");
		RequestDispatcher rd = request.getRequestDispatcher("AdmissionAdvance.jsp");
		rd.forward(request, response);
	}
		
			
	
	}
}
