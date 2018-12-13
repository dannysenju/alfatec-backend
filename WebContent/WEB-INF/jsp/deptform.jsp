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
	<h1>Add New Department</h1>
</div>
<hr/>
<form:form method="post" action="departments/save">
	<div style="align-content: center;">
		<table style="margin: 0 auto;">
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</div>
</form:form>
