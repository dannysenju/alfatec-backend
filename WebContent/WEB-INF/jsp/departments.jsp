
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
	<style type="text/css">
		table, th, td {
			border: 1px solid black;
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
	<h1>Departments List</h1>
</div>
<hr/>
<div style="align-content: center;">
	<table style="width: 50%; margin: 0 auto;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>View Employees</th>
		</tr>
		<c:forEach var="dept" items="${listDepartments}">
			<tr>
				<td>${dept.id}</td>
				<td>${dept.name}</td>
				<td><a href="departments/${dept.id}/employees">Details</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
<br />
<a href="deptform">Add New Department</a>
<a href="${pageContext.request.contextPath}" class="right">Go to Menu</a>




