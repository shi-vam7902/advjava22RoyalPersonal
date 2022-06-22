package com.filter;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculateYearFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("hello");
			 String year = request.getParameter("bYear");
			 year = year.substring(year.length() - 4);

				Calendar c = Calendar.getInstance();
				int currentYear = c.get(Calendar.YEAR);
				
			 	int y = Integer.parseInt(year);
			 	System.out.println(y);
			 	
			 if (y>=1920 && y <= currentYear ) {
					chain.doFilter(request, response);// if second filter is there then call it
					
				 } else {
					
					// else call servlet
					request.setAttribute("error", "Please Enter Valid Birth Year");
					RequestDispatcher rd = request.getRequestDispatcher("FilterInput.jsp");
					rd.forward(request, response);
					
				}
			 
	}
	public void destroy() {
		
	}
}
