<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"/>
<hr/>

	<table align="center" border="1">

		<tr>
			<th>Employee Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>

		<c:forEach var="emp" items="${employees}">

			<tr>
				<th> <a href="findEmployee?id=${emp.id}">${emp.id}</a></th>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>

	</table>

	<hr />

</body>
</html>