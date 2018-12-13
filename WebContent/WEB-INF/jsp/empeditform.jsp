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
	<h1>Edit Employee</h1>
</div>
<hr />

<form:form method="PUT" action="">
	<div style="align-content: center;">
		<table style="width: 50%; margin: 0 auto;">
			<tr>
				<td></td>
				<td><form:hidden path="id" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Department :</td>
				<td>
					<ul>
						<form:select path="departmentDTO.id">
							
							<form:options items="${departments}" itemLabel="name"
								itemValue="id" />
						</form:select>
					</ul>
				</td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Edit Save" /></td>
			</tr>
		</table>
	</div>
</form:form>
