<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>FistName</th>
			<th>LastName</th>
			<th>Email</th>
		</tr>
		<c:forEach var="temp" items="${list}">
			<c:if test="${temp.status}">
				<tr>
					<td>${temp.firstName}</td>
					<td>${temp.lastName}</td>
					<td>${temp.email }</td>
					<td>${temp.status }</td>
				</tr>
			</c:if>
		</c:forEach>
		<%--  <c:if test="${not temp.status}">
        <tr> <td>--</td> <tr>--</td> <td>--</td> <td>--<td> </tr>
        </c:if> --%>
	</table>
</body>
</html>