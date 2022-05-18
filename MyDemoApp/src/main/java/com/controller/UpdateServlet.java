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
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		 String firstname =  request.getParameter("firstname");
		int userid = Integer.parseInt(request.getParameter("userid"));
		
		UserBean user = new UserBean();
		user.setEmail(email);
		user.setUserid(userid);
		user.setFirstname(firstname);
		UserDao userdao = new UserDao();
		boolean status =userdao.UpdateUser(user);
		if(status == false)
		{
			RequestDispatcher rd = request.getRequestDispatcher("EditUser.jsp");
			rd.forward(request, response);
		}
		RequestDispatcher rd = request.getRequestDispatcher("ListUserServlet");
		rd.forward(request, response);
		
		
		
	}
}
