<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<h2>Users</h2>

	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
		</tr>

		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId }</td>
				<td>${user.firstName }</td>
				<td>${user.email }</td>
				<td>${user.password }</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>