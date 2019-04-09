<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<h2>
	<a href="./">Home</a>
</h2>
<h1>V1-Product Saved to DB Successfully. PFB Information</h1>

<hr />
<table border="1" align="center">


	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Price</th>
		<th>Description</th>

	</tr>

	<tr>
		<td>${myProduct.id}</td>
		<td>${myProduct.name}</td>
		<td>${myProduct.price}</td>
		<td>${myProduct.description}</td>

	</tr>

</table>

<hr />




