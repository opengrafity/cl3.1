<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome</title>
</head>
<body>
	<jsp:include page="menubar.jsp" />
	<div>
		<form action="/product/search">
			<select name="category">
				<option value="all" label="All" />
				<option value="grocery" label="Groceries" />
				<option value="stationary" label="Stationary" />
				<option value="veg" label="Vegetable" />				
			</select>
			<input type="submit" value="Search" />
		</form>
	</div>
	<div>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Category</th>
			</tr>
			<c:forEach items="${allProducts}" var="product">
				<tr>
					<td>${product.id.substring(product.id.length()-4)}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.category}</td>
				</tr>
			</c:forEach>
		</table>

	</div>

</body>
</html>