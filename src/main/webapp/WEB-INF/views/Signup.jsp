<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Signup</h2>

<form action="saveuser" method="post">
	FirstName: <input type="text" name="firstName"/><BR><BR>
	Email:<input type="text" name="email"/><BR><BR>
	Password: <input type="text" name="password"/><BR><BR>
	
	<input type="submit" value="Signup"/>
</form>
<br>

<a href="users">List Users</a>
<br><br>
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