<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Update Product Form</h1> <hr/>

<form:form action="updateProduct" method="post" modelAttribute="product">

Product Id: <form:input path="id" readonly="true"/> <br/>
Name: <form:input path="name"/> <br/>
Price: <form:input path="price"/> <br/>
Description: <form:textarea path="description"/> <br/>
<button type="submit">Update</button>
</form:form>


</body>
</html>