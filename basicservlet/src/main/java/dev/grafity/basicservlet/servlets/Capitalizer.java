package dev.grafity.basicservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Capitalizer extends HttpServlet {
	public String capitalize(String str) {
		return str.toUpperCase();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		resp.getWriter().print(name+", Vandhematharam....!");
	}
	
}	
