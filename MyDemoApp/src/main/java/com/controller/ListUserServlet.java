package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import com.bean.UserBean;
import com.dao.UserDao;

public class ListUserServlet extends HttpServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			UserDao userdao = new UserDao();
			ArrayList<UserBean> users = userdao.getAllUsers();
			
			
			request.setAttribute("AllUsers", users);
			RequestDispatcher rd = request.getRequestDispatcher("ListUser.jsp");
			rd.forward(request, response);
	}
}
