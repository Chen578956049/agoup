<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:forEach items="${list}" var="lis">
		<tr>
		<td><c:out value="${lis.CONId}"/></td>
		<td><c:out value="${lis.CONTime}"/></td>
		<td><c:out value="${lis.CONMoney}"/></td>
		<td><c:out value="${lis.CONPhotograph}"/></td>
		<td><c:out value="${lis.CONCid}"/></td>
		<td><c:out value="${lis.CONSid}"/></td>
		<td><c:out value="${lis.CONConstate}"/></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>