package dev.grafity.basicservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=<device-width>, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h3>User Registration</h3>\r\n"
				+ "    <form action=\"users\" method=\"POST\">\r\n"
				+ "        <table>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Userid</td>\r\n"
				+ "                <td><input type=\"text\" name=\"user_id\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Username</td>\r\n"
				+ "                <td><input type=\"text\" name=\"username\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Password</td>\r\n"
				+ "                <td><input type=\"password\" name=\"password\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Gender</td>\r\n"
				+ "                <td>\r\n"
				+ "                    <input type=\"radio\" name=\"gender\" value=\"M\" id=\"male\"> <label for=\"male\"> Male</label>\r\n"
				+ "                    <input type=\"radio\" name=\"gender\" value=\"F\" id=\"female\"> <label for=\"female\"> Female</label>\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Mobile Number</td>\r\n"
				+ "                <td><input type=\"text\" name=\"mobile_number\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Address</td>\r\n"
				+ "                <td><textarea name=\"address\" cols=\"50\" rows=\"5\"></textarea></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>City</td>\r\n"
				+ "                <td><input type=\"text\" name=\"city\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>Pincode</td>\r\n"
				+ "                <td><input type=\"text\" name=\"pincode\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td colspan=\"2\">\r\n"
				+ "                    <input type=\"submit\" value=\"Submit\">\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "        </table>\r\n"
				+ "    </form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
