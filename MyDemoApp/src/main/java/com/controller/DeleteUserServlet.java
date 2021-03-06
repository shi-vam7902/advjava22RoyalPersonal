package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userid = Integer.parseInt(request.getParameter("Userid"));

		UserDao userDao = new UserDao();
		userDao.deleteUser(userid);

//		RequestDispatcher rd = request.getRequestDispatcher("ListUserServlet");
//		rd.forward(request, response);
		response.sendRedirect("ListUserServlet");
	}
}
