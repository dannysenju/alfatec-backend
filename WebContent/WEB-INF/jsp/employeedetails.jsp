<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<style type="text/css">
table, th, td {
	border: none;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: center;
}
.right {
		    position: fixed;
		    top: 10%;
		    right: 16px;
		}
</style>
</head>

<div style="text-align: center;">
	<h1>Employee ${searchResult.name} Details</h1>
</div>
<hr />
<div style="align-content: center;">
	<table style="width: 50%; margin: 0 auto;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>LastName</th>
			<th>Department</th>
		</tr>
		<tr>
			<td>${searchResult.id}</td>
			<td>${searchResult.name}</td>
			<td>${searchResult.lastName}</td>
			<td>${searchResult.departmentDTO.name}
		</tr>
	</table>
</div>
<hr/>
<a href="${pageContext.request.contextPath}" class="right">Go to Menu</a>














