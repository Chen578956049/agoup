<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="com.vo.StaffVo"%>
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

		<title>My JSP 'customerCondition_add.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<LINK href="<%=basePath%>resource/css/admin.css" type=text/css  rel=stylesheet>
		<script type="text/javascript" src="<%=basePath%>resource/js/CheckForm.js"></script>
	</head>

	<body>
		<form action="<%=basePath%>findCustomerByCAId"  name="form2" onsubmit="return checkForm('form2');" method="post" >
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr class=editHeaderTr>
					<td class=editHeaderTd colSpan=7>
						请输入合同的详细信息
					</td>
				</tr>
				
				<tr>
					<td width="13%" bgcolor="#FFFDF0">
						<div align="center">
							合同名称：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
<<<<<<< HEAD
						<input type="text" name="CONId"  maxlength="10" style="width: 145px" valid="required"  errmsg="合同名称不能为空!" >
						&nbsp;
					</td>
					
					
				
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							合同签订时间：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="date" name="CONTime" style="width: 145px"  maxlength="2"  valid="required" value=""  errmsg="合同签订时间不能为空!">
						&nbsp;
					</td>

					
				</tr>
				
				<tr>
					<td bgcolor="#FFFDF0" style="height: 21px">
						<div align="center">
							总金额：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONMoney"  maxlength="20" style="width: 145px" valid="required"  errmsg="总金额不能为空!">
						&nbsp;
					</td>
					
				</tr>
				
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							客户编号：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONCid"  maxlength="20" style="width: 145px" valid="required"  errmsg="客户编号不能为空!">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							员工编号：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONSid"  maxlength="20" style="width: 145px" valid="required"  errmsg="员工编号不能为空!">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							合同状态：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<!-- <input type="text" name="CONConstate"  maxlength="20" style="width: 145px"> -->
						<select name="CONConstate" style="width: 145px">
							<option>签订</option>
							<option>未签订</option>
						</select>
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							合同内容：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONPhotograph"  maxlength="20" style="width: 145px">
=======
						<input type="text" name="CONId"  maxlength="10" style="width: 145px" valid="required"  check_str="合同名称不能为空!" >
						&nbsp;
					</td>
					
					
				
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							合同签订时间：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="date" name="CONTime" style="width: 145px"  maxlength="2"  valid="required" value=""  check_str="合同签订时间不能为空!">
						&nbsp;
					</td>

					
				</tr>
				
				<tr>
					<td bgcolor="#FFFDF0" style="height: 21px">
						<div align="center">
							总金额：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONMoney"  maxlength="20" style="width: 145px" valid="required"  check_str="总金额不能为空!">
						&nbsp;
					</td>
					
				</tr>
				
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							客户编号：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONCid"  maxlength="20" style="width: 145px" valid="required"  check_str="客户编号不能为空!">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							员工编号：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONSid"  maxlength="20" style="width: 145px" valid="required"  check_str="员工编号不能为空!">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							合同状态：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<!-- <input type="text" name="CONConstate"  maxlength="20" style="width: 145px"> -->
						<select name="CONConstate" style="width: 145px" >
							<option>签订</option>
							<option>未签订</option>
						</select>
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							合同内容：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="CONPhotograph"  maxlength="20" style="width: 145px" check_str="合同内容不能为空!">
>>>>>>> refs/remotes/origin/master
						&nbsp;
					</td>
				</tr>

			</table>
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr bgcolor="#ECF3FD">
					<td width="10%"></td>
					<td width="10%"><input type="submit" name="submit"  value="提交"></td>
					<td width="5%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
					<td width="75%"></td>
				</tr>
			</table>

		</form>
	</body>
</html>
