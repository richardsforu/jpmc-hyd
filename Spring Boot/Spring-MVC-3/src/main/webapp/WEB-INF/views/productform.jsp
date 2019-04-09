<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Product Registration</h1> <hr/>

<form action="saveProduct_v1" method="post">
Id: <input type="text" name="id"/> <br/>
Name: <input name="name"/><br/>
Price: <input type="number" name="price"> <br/>
Description: <textarea name="description"></textarea> <br/>

<input type="submit">


</form>

<hr/>


</body>
</html>