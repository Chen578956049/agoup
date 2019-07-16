<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>客户关系管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<frameset rows="98,*,8" border="7" bordercolor="#1873aa" scrolling="No"
	noresize="noresize" framespacing="0">
	<frame src="<%=basePath%>top" name="topFrame"
		scrolling="No" noresize="noresize" id="topFrame" />
	<frameset cols="166,*">
		<frame src="<%=basePath%>left" noresize="noresize" />
		<c:if test="${sessionScope.list.SPid==1}">
			<frame src="<%=basePath%>queryLog" name="mainFrame" />
		</c:if>
		<c:if test="${sessionScope.list.SPid==2}">
		    <frame src="<%=basePath%>queryLogBySID?sid=${sessionScope.list.SId}" name="mainFrame" />
		</c:if>
	</frameset>
	<frame src="<%=basePath%>down" name="bottomFrame"
		scrolling="No" noresize="noresize" id="bottomFrame" />
</frameset>
</html>
