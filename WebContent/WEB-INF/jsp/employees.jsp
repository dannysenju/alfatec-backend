
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
	<h1>Employees List</h1>
</div>
<hr />
<div style="align-content: center;">
	<table style="width: 50%; margin: 0 auto;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>LastName</th>
			<th>Department</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.lastName}</td>
				<td>${emp.departmentDTO.name}
				<td><a href="employees/editemp/${emp.id}">Edit</a></td>
				<td>
					<form:form method="delete" action="employees/${emp.id}">
						<button id="btn-delete" type="submit" 
						onclick="return confirm('Are you sure you want to continue deleted')">Delete</button>
					</form:form>
					
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
<hr/>
<a href="empform">Add New Employee</a>
<a href="${pageContext.request.contextPath}" class="right">Go to Menu</a>





