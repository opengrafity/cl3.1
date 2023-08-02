<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="register" modelAttribute="user">	
		Username: <f:input path="username"/> <br/>
		Password: <f:input path="pwd"/> <br/>
		Mobile No: <f:input path="mobile"/> <br/>
		<input type="submit" value="Submit"/>
	</f:form>
</body>
</html>