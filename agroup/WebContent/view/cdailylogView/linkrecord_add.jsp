<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="base" value="<%=basePath%>" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>增加客户联系记录</title>
<title>My JSP 'linkrecord_add.jsp' starting page</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="<%=basePath%>resource/css/admin.css" type=text/css
	rel=stylesheet charset="UTF-8">
<script type="text/javascript"
	src="<%=basePath%>resource/js/CheckForm.js" charset="UTF-8"></script>
<script type="text/javascript"
	src="<%=basePath%>resource/js/My97DatePicker/WdatePicker.js" charset="UTF-8"></script>
<script type="text/javascript"
	src="<%=basePath%>resource/jquery-easyui/jquery.min.js" charset="UTF-8"></script>
</head>
<body>
	<!-- onsubmit="return checkForm('form1');" -->
	<form name="form1" action="${base}addLog" onsubmit="return checkForm('form1');" id="form1" target="mainFrame">
		<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
			align=center border=0>
			<tr class=editHeaderTr>
				<td class=editHeaderTd colSpan=7>请输入客户联系记录</td>
			</tr>
			<tr>
				<td width="11%" bgcolor="#FFFDF0">
					<div align="center">客户姓名：</div>
				</td>
				<td colspan="3" bgcolor="#FFFFFF"><input type="text"
					style="width: 145px" check_str="客户姓名"  maxlength="20" name="lCid" id="lCid">
				</td>
				<td width="12%" bgcolor="#FFFDF0">
					<div align="center">联系人:</div>
				</td>
				<td width="32%" colspan="3" bgcolor="#FFFFFF"><input
					type="text" style="width: 145px" check_str="联系人" maxlength="20"
					name="lSid" id= "lSid"></td>
			</tr>


			<tr>
				<td bgcolor="#FFFDF0">
					<div align="center">联系时间：</div>
				</td>
				<td colspan="3" bgcolor="#FFFFFF"><input type="text"
					style="width: 145px" name="lTime" id="lTime" check_str="联系时间"
					readonly="readonly" 
					onclick="WdatePicker({el:lTime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
					&nbsp;</td>
				<td bgcolor="#FFFDF0">
					<div align="center">下次联系时间：</div>
				</td>
				<td colspan="3" bgcolor="#FFFFFF"><input type="text"
					style="width: 145px" name="lNtime" id="lNtime" check_str="下次联系时间"
					readonly="readonly" 
					onclick="WdatePicker({el:lNtime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
					&nbsp;</td>
				
			</tr>

			<tr>
				<td bgcolor="#FFFDF0">
					<div align="center">联系内容：</div>
				</td>
				<td colspan="5" bgcolor="#FFFFFF"><textarea rows="10"
						name="lScheduling" check_str="联系内容"  id="lScheduling"
						style="width: 100%; resize: none;"></textarea></td>
			</tr>
		</table>
		<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
			align=center border=0>
			<tr bgcolor="#ECF3FD">
				<td width="25%"></td>
				<!-- <td width="17%"><a id="loginFormBtn" class="easyui-linkbutton">添加</a></td> -->
				<td width="17%"><input type="submit"
					name="submit"  value="添加" /></td>
				<td width="17%"><input type="reset" name="reset" value="重置"></td>
				<td width="4%"><input type="button" name="button"
					onClick="history.back() " value="返回"></td>
				<td width="43%"></td>
			</tr>
		</table>

	</form>
</body>
</html>