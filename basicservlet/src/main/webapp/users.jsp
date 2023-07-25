<%@page import="dev.grafity.basicservlet.models.User"%>
<%@page import="dev.grafity.basicservlet.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
 	int userId = Integer.parseInt(request.getParameter("user_id"));
	UserDao dao = new UserDao();
	User user = dao.getUser(userId);
%>
<html>
    <body>
        <table border="1">
            <tr>
                <td><b>Property</b></td>
                <td><b>Value</b></td>
            </tr>
            <tr>
                <td>userId</td>
                <td><%=userId%></td>
            </tr>
            <tr>
                <td>username</td>
                <td><%=user.getUsername()%></td>
            </tr>
            <tr>
                <td>password</td>
                <td><%=user.getPassword()%></td>
            </tr>
            <tr>
                <td>gender</td>
                <td><%=user.getGender()%></td>
            </tr>
            <tr>
                <td>mobileNumber</td>
                <td><%=user.getMobileNumber()%></td>
            </tr>
            <tr>
                <td>address</td>
                <td><%=user.getAddress()%></td>
            </tr>
            <tr>
                <td>city</td>
                <td><%=user.getCity()%></td>
            </tr>
            <tr>
                <td>pincode</td>
                <td><%=user.getPincode()%></td>
            </tr>
        </table>
    </body>
</html>