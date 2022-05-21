package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ExpUserBean;
import com.dao.UserStorage;
@WebServlet("/ExpenseServlet")
public class ExpenseServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String Gender = request.getParameter("gender");
		
		ExpUserBean user = new ExpUserBean();
		user.setEmail(email);
		user.setFirstName(firstname);
		user.setGender(Gender);
		user.setPassword(password);
		int x = (int)(Math.random()* 1000000);
		user.setUserId(x);
		
		ArrayList<ExpUserBean> users = new ArrayList<ExpUserBean>();
		users.add(user);
		UserStorage.users.add(user);

		RequestDispatcher rd = request.getRequestDispatcher("ExpenseLogin.jsp");
		rd.forward(request, response);
	}
}
