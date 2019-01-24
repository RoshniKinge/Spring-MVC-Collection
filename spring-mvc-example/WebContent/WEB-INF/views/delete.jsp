<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/spring-mvc-example/deleteId" method="POST">
		<form:label path="empId">ID:</form:label>
		<form:input path="empId" name="id" placeholder="Enter id"/>
		<form:button value="submit">Delete</form:button>
	</form:form>
</body>
</html>