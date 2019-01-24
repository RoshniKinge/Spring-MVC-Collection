<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search record</title>
</head>
<body>
	<form:form action="/spring-mvc-example/search" modelAttribute="empData"
		method="POST">
		<form:label path="empId">ID:</form:label>
		<form:input path="empId" placeholder="Enter id" />
		<form:button value="submit">Search</form:button>
	</form:form>
	<form:form action="/spring-mvc-example/updateEmployee"
		modelAttribute="empData" method="POST">
		<table align="center">

			<tr>
				<th><form:label path="empId">Id:</form:label></th>
				<td><form:input path="empId" readonly="true"></form:input></td>
			</tr>
			<tr>
				<th><form:label path="empName">Name:</form:label></th>
				<td><form:input path="empName"></form:input></td>
			</tr>
			<tr>
				<th><form:label path="salary">Salary:</form:label></th>
				<td><form:input path="salary"></form:input></td>
			</tr>
			<tr>
				<th><form:label path="designation">Designation:</form:label></th>
				<td><form:input path="designation"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><form:button value="submit">Update</form:button></td>
			</tr>

		</table>
	</form:form>
</body>
</html>