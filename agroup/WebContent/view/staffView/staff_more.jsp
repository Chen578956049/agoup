<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>员工详细信息</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<LINK href="<%=basePath%>resource/css/admin.css" type=text/css
			rel=stylesheet>
			<script type="text/javascript"
			src="<%=basePath%>resource/js/CheckForm.js"></script>
		<script type="text/javascript"
			src="<%=basePath%>resource/js/My97DatePicker/WdatePicker.js"></script>
			

	</head>

	<body>
		<form action=" <%=basePath%>servlet/UserUpdateServlet" method="get" name="form2"  >
<%-- 			<%
				UserInfo userinfo = (UserInfo) request.getAttribute("userinfo");
			%> --%>
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr class=editHeaderTr>
					<td class=editHeaderTd colSpan=7>
						用户的详细信息
						<input type="hidden" name="id" value="<%-- <%=userinfo.getUserId() %> --%>"readonly="readonly">
					</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">姓名：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserName() %> --%></td>
					<td bgcolor="#FFFDF0"><div align="center">年龄：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserAge() %> --%></td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0" style="height: 21px"><div align="center">性别：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" style="height: 21px" align="center"><%-- <%=userinfo.getUserSex() %> --%></td>
					<td bgcolor="#FFFDF0"><div align="center">管辖地区：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserNation() %> --%></td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">学历：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"> <%-- <%=userinfo.getUserDiploma() %> --%></td>
					<td bgcolor="#FFFDF0"><div align="center">入职日期：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getIsMarried()%> --%></td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">薪资：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getDepartmentName() %> --%></td>
					<td bgcolor="#FFFDF0"><div align="center">职位：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getRoleName() %> --%></td>
	
			
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">工资卡号：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserBankcard() %> --%></td>
					<td bgcolor="#FFFDF0"><div align="center">手机：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserMobile()%> --%></td>

				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">身份证：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserIdnum() %> --%></td>
					<td bgcolor="#FFFDF0"><div align="center">E_mail：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserAddtime() %> --%></td>
				</tr>
				
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">地址：</div></td>
					<td colspan="5" bgcolor="#FFFFFF" align="center"><%-- <%=userinfo.getUserAddress()%> --%></td>
				</tr>

			</table>
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr bgcolor="#ECF3FD">
					<td width="36%"></td>
					
					<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
					<td width="43%"></td>
				</tr>
			</table>

		</form>

	</body>
</html>
