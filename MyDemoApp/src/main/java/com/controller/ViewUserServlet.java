package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

@WebServlet("/ViewUserServlet")
public class ViewUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		
		int userId = Integer.parseInt(request.getParameter("Userid"));//Userid=28
		UserDao userDao = new UserDao();
		UserBean user = userDao.getUserById(userId);
		request.setAttribute("user", user);
		System.out.println(user);
		RequestDispatcher rd = request.getRequestDispatcher("ViewUser.jsp");
		rd.forward(request, respone);
		
	}
}
