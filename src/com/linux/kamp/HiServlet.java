package com.linux.kamp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.linux.kamp.model.User;

public class HiServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		resp.getWriter().write("<h1>Hi " + user.getName() + "</h1>");
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String user = req.getParameter("user");
		
		System.out.println(user);

		resp.getWriter().write("<h1>I had your post</h1>You are here: " + req.getRequestURI());
	}

	
}
