<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
</head>
<body>
	<h3 align ="center">Welcome, Enter The Employee Details</h3>
	<form method="POST" action="/spring-mvc-example/display">
		<table  align = "center" style="with: 50%">
				<tr>
					<td>ID:</td>
					<td><input  name="empId" /></td>
				</tr>
		
				<tr>
					<td>Name:</td>
					<td><input name="empName" /></td>
				</tr>
					<tr>
					<td>Salary:</td>
					<td><input  name="salary" /></td>
				</tr>
				<tr>
					<td>Designation:</td>
					<td><input  name="designation" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="Submit" /></td>
				</tr>
		</table>
	</form>
</body>
</html>