<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="menu.jsp" />
	<hr />
	<form:form action="updateEmployee" method="post"
		modelAttribute="employee">


		<table align="center" cellpadding="5" cellspacing="5">

			<tr>
				<th>Employee Id:</th>
				<td><form:input path="id" readonly="true" /></td>
			</tr>

			<tr>
				<th>Employee Name:</th>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<th>Salary:</th>
				<td><form:input path="salary" /></td>
			</tr>

			<tr>
				<th colspan="2">
					<button type="submit">Update</button>
				</th>
			</tr>

		</table>
	</form:form>
	<hr />

</body>
</html>