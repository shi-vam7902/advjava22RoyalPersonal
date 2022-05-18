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

@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userid = Integer.parseInt(request.getParameter("Userid"));
		String name = request.getParameter("Firstname");
		String email = request.getParameter("Email");
		
		
		UserDao userdao = new UserDao();
		
		UserBean user = new UserBean();
		
		user.setFirstname(name);
		user.setUserid(userid);
		user.setEmail(email);
		
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("EditUser.jsp");
		rd.forward(request, response);
		
	}
}
