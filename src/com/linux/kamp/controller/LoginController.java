package com.linux.kamp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.linux.kamp.service.UserService;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String username = (String) req.getParameter("username");
		String password = (String) req.getParameter("password");

		UserService userService = new UserService();
		boolean isAuthenticated = userService.checkAuthentication(username,
				password);

		HttpSession session = req.getSession();
		if (isAuthenticated) {
			session.setAttribute("isAuthorized", true);
			req.setAttribute("message", "Login successful");
			req.getRequestDispatcher("result.jsp").forward(req, resp);
		}
		else{
			session.setAttribute("isAuthorized", false);
			req.setAttribute("message", "Wrong credentials");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}

	}
}
