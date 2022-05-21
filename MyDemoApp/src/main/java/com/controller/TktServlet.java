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

@WebServlet("/TktServlet")
public class TktServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int mob = Integer.parseInt(request.getParameter("number"));
		String category = request.getParameter("category");
		int quantity = Integer.parseInt(request.getParameter("qty"));

		TktUserBean user = new TktUserBean();
		user.setName(name);
		user.setNumber(mob);
		user.setQty(quantity);
		user.setCategory(category);

		ArrayList<TktUserBean> users = new ArrayList<TktUserBean>();
		users.add(user);
		TtkUserStorage.users.add(user);

		RequestDispatcher rd = request.getRequestDispatcher("TktServlet");
		rd.forward(request, response);

	}
}
