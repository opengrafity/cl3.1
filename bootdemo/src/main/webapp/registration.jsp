<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<sf:form action="/storeuser" modelAttribute="user">
		Username <sf:input path="username"/>
		Password <sf:input path="password"/>
		Mobile No <sf:input path="mobileno"/>
		Address <sf:textarea path="address"></sf:textarea>
		<input type="submit" value="Submit"/>
	</sf:form>
</body>
</html>