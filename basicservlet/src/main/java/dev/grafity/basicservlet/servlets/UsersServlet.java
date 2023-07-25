package dev.grafity.basicservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dev.grafity.basicservlet.dao.UserDao;
import dev.grafity.basicservlet.models.User;

public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public UsersServlet() {
        super();
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("user_id"));
		PrintWriter out = response.getWriter();
		UserDao dao = new UserDao();
		
		try{
			User user = dao.getUser(userId);		
			out.printf("<html>	\r\n"
					+ "	<body>\r\n"
					+ "		<table border=\"1\">\r\n"
					+ "			<tr><td><b>Property</b></td><td><b>Value</b></td></tr>\r\n"
					+ "			<tr><td>userId</td><td>%d</td></tr>\r\n"
					+ "			<tr><td>username</td><td>%s</td></tr>\r\n"
					+ "			<tr><td>password</td><td>%s</td></tr>\r\n"
					+ "			<tr><td>gender</td><td>%s</td></tr>\r\n"
					+ "			<tr><td>mobileNumber</td><td>%s</td></tr>\r\n"
					+ "			<tr><td>address</td><td>%s</td></tr>\r\n"
					+ "			<tr><td>city</td><td>%s</td></tr>\r\n"
					+ "			<tr><td>pincode</td><td>%s</td></tr>\r\n"
					+ "		</table>	\r\n"
					+ "	</body>\r\n"
					+ "</html>", userId, user.getUsername(), user.getPassword(), user.getGender(), user.getMobileNumber(), user.getAddress(), user.getCity(), user.getPincode());
		}catch(SQLException ex) {
			ex.printStackTrace();
			out.print("Error while fetching the user information");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setUserId(Integer.parseInt(request.getParameter("user_id")));
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setGender(request.getParameter("gender"));
		user.setMobileNumber(request.getParameter("mobile_number"));
		user.setAddress(request.getParameter("address"));
		user.setCity(request.getParameter("city"));
		user.setPincode(request.getParameter("pincode"));
		HttpSession session = request.getSession(true);
		user.setRegisteredBy(session.getAttribute("registeredBy").toString());
		UserDao dao = new UserDao();
		PrintWriter out = response.getWriter();
		try {
			if(dao.saveUser(user)) {
				out.print("User saved successfully");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			out.print("Error while saving the user information");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

	
}
