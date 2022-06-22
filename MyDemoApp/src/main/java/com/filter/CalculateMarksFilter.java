package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculateMarksFilter implements Filter {
	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String maths = request.getParameter("maths");
		String physics = request.getParameter("physics");
		String chemistry = request.getParameter("chemistry");

		
		if (maths == null || maths.trim().length() == 0 || physics == null || physics.trim().length() == 0 || chemistry == null || chemistry.trim().length() == 0) {
			System.out.println("in if");
			request.setAttribute("error", "Please Enter Valid Input");
			
			RequestDispatcher rd = request.getRequestDispatcher("AdmissionAdvance.jsp");
			rd.forward(request, response);
			
		} else {
			chain.doFilter(request, response);// if second filter is there then call it
			// else call servlet
			
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
