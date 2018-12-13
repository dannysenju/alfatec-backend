
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
	<h1>Detail ${dptName} Department</h1>
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
		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.lastName}</td>
				<td>${emp.departmentDTO.name}
			</tr>
		</c:forEach>
	</table>
</div>
<hr />
<div style="text-align: center;">
	<form:form method="get" action="employees/search">
		<h3>Find Employee by Id:</h3>
		<div>
			<div style="padding-bottom: 10px;">
				<input type="number" id="txt" name="searchTerm">
			</div>
			<div>
				<button id="button-id" type="submit">Search Employee</button>
			</div>
		</div>
	</form:form>
</div>
<hr />
<a href="${pageContext.request.contextPath}" class="right">Go to Menu</a>
















