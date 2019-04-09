<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>
<h1>Welcome to two.jsp file - V2</h1>

<h2>City: ${cityName }</h2>
<hr/>
<table border="1" align="center">


<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Price</th>
	<th>Description</th>
	
</tr>

<tr>
	<td> ${myProduct.id}</td>
	<td> ${myProduct.name}</td>
	<td> ${myProduct.price}</td>
	<td> ${myProduct.description}</td>
	
</tr>

</table>

<hr/>

<hr/>
<table border="1" align="center">


<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Price</th>
	<th>Description</th>
	
</tr>

<c:forEach items="${products}" var="myProduct">

<tr>
	<td> ${myProduct.id}</td>
	<td> ${myProduct.name}</td>
	<td> ${myProduct.price}</td>
	<td> ${myProduct.description}</td>
	
</tr>
</c:forEach>




</table>








