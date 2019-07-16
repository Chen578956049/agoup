<%@ page language="java" contentType="text/html; charset=UTF-8"
import="com.vo.StaffVo"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询</title>
</head>
<body>
<%	
	StaffVo sta=(StaffVo)request.getSession().getAttribute("staff");
	out.print(sta);
%>	<a href="StaffIdSelectContract?sta=${staff}">修改</a>
	<a href=""></a>
</body>
</html>