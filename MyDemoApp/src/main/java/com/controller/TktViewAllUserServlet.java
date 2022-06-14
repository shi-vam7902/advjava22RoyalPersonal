package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.TktUserBean;
import com.dao.TtkUserStorage;
import com.dao.UserStorage;
@WebServlet("/TktViewAllUserServlet")
public class TktViewAllUserServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		
		TtkUserStorage userStorage = new  TtkUserStorage();
		ArrayList<TktUserBean> users = userStorage.viewAllUsers();
		request.setAttribute("allusers", users);
		
		RequestDispatcher rd = request.getRequestDispatcher("TktViewAllUsers.jsp");
		rd.forward(request, response);
	
	}
}
