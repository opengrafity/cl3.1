<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
</head>
<body>
   <jsp:include page="menubar.jsp"/>
    <div>
        <h2>Register a product</h2>
        <sf:form action="/product/register" modelAttribute="product">
            <table>
                <tr>
                    <td>Product Category</td>
                    <td>
                        <sf:select path="category">
                        	<sf:option value="grocery" label="Groceries"/>
                        	<sf:option value="stationary" label="Stationary"/>
                        	<sf:option value="veg" label="Vegetable"/>
                        </sf:select>                        
                    </td>
                </tr>
                <tr>
                	<td>Product Name</td>
                    <td>
                        <sf:input path="name"/>
                    </td>
                </tr>
                <tr>
                	<td>Product Price</td>
                    <td>
                        <sf:input path="price"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save"/>
                    </td>
                </tr>
            </table>    
        </sf:form>
    </div>
</body>
</html>