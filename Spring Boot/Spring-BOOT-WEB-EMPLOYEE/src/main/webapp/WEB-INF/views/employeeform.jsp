<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function formValidation() {
		var id = document.getElementById("id").value;
		var name = document.getElementById("name").value;
		var salary = document.getElementById("salary").value;

		var flag=true;
		if (id == "" || id == " ") {
			
			document.getElementById("idError").innerHTML="ID Required";
			flag=false;
		}else{
			document.getElementById("idError").innerHTML="";
			}
		if (name == "" || name == " ") {
			document.getElementById("nameError").innerHTML="Name Required";
			flag= false;
		}else{
			document.getElementById("nameError").innerHTML="";
			}
		if (salary == "" || salary == " ") {
			document.getElementById("salaryError").innerHTML="Salary Required";
			flag= false;
		}else{
			document.getElementById("salaryError").innerHTML="";
			}

		return flag;
	}
</script>
</head>
<body>

	<jsp:include page="menu.jsp" />
	<hr />
	<form action="saveEmployee" onsubmit="return formValidation()">


		<table align="center" cellpadding="5" cellspacing="5">

			<tr>
				<th>Employee Id:</th>
				<td><input type="text" name="id" id="id" /> <span id="idError"></span>
				</td>

			</tr>

			<tr>
				<th>Employee Name:</th>
				<td>
				<input type="text" name="name" id="name" />
				<span id="nameError"></span>
				</td>
			</tr>

			<tr>
				<th>Salary:</th>
				<td>
				<input type="number" name="salary" id="salary" />
				<span id="salaryError"></span>
				</td>
			</tr>

			<tr>
				<th colspan="2">
					<button type="submit">Save</button>
				</th>
			</tr>

		</table>
	</form>
	<hr />

</body>
</html>