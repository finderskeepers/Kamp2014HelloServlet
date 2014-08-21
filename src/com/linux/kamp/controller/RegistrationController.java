package com.linux.kamp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.linux.kamp.model.User;
import com.linux.kamp.service.UserService;

public class RegistrationController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String username = (String) req.getParameter("username");
		String password = (String) req.getParameter("password");
		String address = (String) req.getParameter("address");

		User user = new User();
		user.setName(username);
		user.setAddress(address);
		user.setPassword(password);

		UserService userService = new UserService();
		boolean result = userService.save(user);
		
		req.setAttribute("success", result);
		req.getRequestDispatcher("result.jsp").forward(req, resp);

	}
}
