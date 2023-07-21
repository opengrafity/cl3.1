package dev.grafity.basicservlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String username = request.getParameter("loginuser");
		String password = request.getParameter("password");
		HttpSession session = request.getSession(true);
		session.setAttribute("registeredBy", username);
		//logic		
		response.getWriter().print("Login Successful");
		//response.setHeader("", "");
		response.sendRedirect("register");
		
		/*
		 * RequestDispatcher dispatch = request.getRequestDispatcher("register");
		 * dispatch.forward(request, response);
		 */
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
