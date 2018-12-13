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
	<h1>Add New Employee</h1>
</div>
<hr />
<form:form method="post" action="employees/save">
	<div style="align-content: center;">
		<table style="margin: 0 auto;">
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>LastName :</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Department :</td>
				<td>
					<ul>
						<form:select path="departmentDTO.id">
							<form:option value="-" label="--Select department" />
							<form:options items="${departments}" itemLabel="name"
								itemValue="id" />
						</form:select>
					</ul>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</div>
</form:form>
<hr />
<a href="${pageContext.request.contextPath}" class="right">Go to Menu</a
