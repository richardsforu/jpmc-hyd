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

	<jsp:include page="menu.jsp" />
	<hr />
	<form action="findEmployee">


		<table align="center" border="1">

			<tr>
				<th>Employee Id:</th>
				<td><input type="text" name="id" /></td>
			</tr>

			<tr>
				<th colspan="2">
				${param.msg}
				</th>
			</tr>	
		
			<tr>
				<th colspan="2">
					<button type="submit">Find</button>
				</th>
			</tr>

		</table>
	</form>
	<hr />

</body>
</html>