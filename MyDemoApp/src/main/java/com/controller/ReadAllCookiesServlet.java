package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ReadAllCookiesServlet")
public class ReadAllCookiesServlet  extends HttpServlet{

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
		 Cookie c[]	= request.getCookies();
		 for(int i = 0;i<c.length;i++) {
			 System.out.println(c[i].getName()+" ==> "+c[i].getValue());
		 }
			 
		}
}
