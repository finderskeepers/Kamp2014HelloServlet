package com.linux.kamp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.linux.kamp.model.User;

public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		User user = new User();
		user.setName("Ozan");
		user.setId("13");
		
		HttpSession session = request.getSession();
		
	    session.setAttribute("user", user);
		
		User result = user;
		request.setAttribute("user", result);
		request.setAttribute("message", "New user created");
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("test.jsp");
		dispatcher.forward(request, response);
	}
}
