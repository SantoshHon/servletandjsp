package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private String loginId;     
	private String password;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		loginId = request.getParameter("txtlogin");
		password = request.getParameter("txtPassword");
		
		if (loginId.equals(password)) {
			//response.sendRedirect("success.jsp");
			RequestDispatcher requestdispatcher=request.getRequestDispatcher("success.jsp");
			requestdispatcher.forward(request, response);
		} else {
			//response.sendRedirect("failure.jsp");
			RequestDispatcher requestdispatcher=request.getRequestDispatcher("failure.jsp");
			requestdispatcher.forward(request, response);
		}
	}

}
