<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加客户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<LINK href="resource/css/admin.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="resource/js/CheckForm.js"></script>
	<script type="text/javascript" src="resource/js/My97DatePicker/WdatePicker.js"></script>
	<script language="JavaScript" type="text/javascript" src="resource/js/FormValid.js"></script>


  </head>
  
  <body>
<form action="addcli"  method="post" onsubmit="return checkForm('form3');" name="form3">
<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
	<tr class=editHeaderTr>
		<td class=editHeaderTd colSpan=7>  请输入客户信息</td>
	</tr>  
    <tr>
	    <td bgcolor="#FFFDF0"><div align="center">客户姓名：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"   maxlength="20" style=" width: 145px" name="customerJob" check_str="客户姓名"></td>
	  	
	 	
    </tr>
	
    <tr>
		
		
			<%-- <%List <CustomerSourceInfo> sourceList =(List <CustomerSourceInfo>) request.getAttribute("sourceInfo"); %> --%>
			<%-- <%for ( int i=0;i<sourceList.size();i++){
											CustomerSourceInfo sourceInfo =sourceList.get(i);
										%>		 --%>
			<option  value="<%-- <%=sourceInfo.getSourceId() %> --%>"><%-- <%=sourceInfo.getSourceName() %> --%></option>
			<%-- <% }%> --%>
		</select>	  </td>
		<td bgcolor="#FFFDF0"><div align="center">客户状态：</div></td>
		<td colspan="3" bgcolor="#FFFFFF">
		<select name="customerType" style=" width: 145px">
			<option >潜在客户</option>
			<option >已成交客户</option>
			<option> 老客户</option>
		<%-- 	<%List <CustomerTypeInfo> typeList =(List <CustomerTypeInfo>) request.getAttribute("typeInfo"); %>
			<%for ( int i=0;i<typeList.size();i++){
											CustomerTypeInfo typeInfo =typeList.get(i);
										%>		 --%>
			<option  value="<%-- <%=typeInfo.getCustomerTypeId() %> --%>"><%-- <%=typeInfo.getCustomerTypeName() %> --%></option>
			<%-- <% }%> --%>
		</select>		</td>
    </tr>
	<tr>
		
		<td bgcolor="#FFFDF0"><div align="center">邮箱（Email）：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input style=" width: 145px"  maxlength="50"  type="text" name="customerEmail"   valid="required|isEmail" check_str="邮箱" check_type="email"  errmsg="Email不能为空|Email格式不对!"></td>
    </tr>
	
	
    <tr>
		<td bgcolor="#FFFDF0"><div align="center" >客户手机：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"   valid="regexp"  regexp="^1[3|4|5|8][0-9]\d{8}$" check_str="手机号码" errmsg="请输入正确的手机号码!"  style=" width: 145px"    name="customerMobile"></td>
		
    </tr>
     <tr>
    <td bgcolor="#FFFDF0"><div align="center">客户QQ：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"  check_str="QQ号码"    valid="isQQ"   errmsg="请输入正确的QQ号码!"  style=" width: 145px" name="customerQq"></td>
  	</tr>
	<tr>
		<td bgcolor="#FFFDF0"><div align="center">客户地址：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"  check_str="地址" maxlength="50"  style=" width: 145px" name="customerAddress"></td>
		
    </tr>

    <tr>
		<td bgcolor="#FFFDF0"><div align="center">所属区域编号：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"  maxlength="50" check_str="区域编号" style=" width: 145px" name="customerAddress1"></td>
		
    </tr>
    <tr>
		<td bgcolor="#FFFDF0"><div align="center">所属员工编号：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"  maxlength="50" check_str="员工编号" style=" width: 145px" name="yuangong"></td>
		
    </tr>
	<%-- <tr>
		<td bgcolor="#FFFDF0"><div align="center">客户座机：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"   valid="isPhone"   errmsg="请输入正确的座机号码!"   style=" width: 145px" name="customerTel"></td>
		<td bgcolor="#FFFDF0"><div align="center">客户MSN：</div></td>
		<td colspan="3" bgcolor="#FFFFFF"><input type="text"    maxlength="50" style=" width: 145px" name="customerMsn"></td>
    </tr>
  
	<tr>
		<td bgcolor="#FFFDF0"><div align="center">客户公司：</div></td>
		<td colspan="5" bgcolor="#FFFFFF"><input type="text"  maxlength="50"  style=" width: 145px" name="customerCompany">
		<input type="hidden"    value="<%=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())%>"  name="customerAddTime" >
		<input type="hidden"    value="<%=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())%>"  name="customerChangeTime" >		</td>
		
    </tr>
    
	<tr>
		<td bgcolor="#FFFDF0"><div align="center">备注：</div></td>
		<td colspan="5" bgcolor="#FFFFFF"><textarea rows="10" name="customerRemark" style="width:100%; resize:none; "  ></textarea></td>
	</tr> --%>
	<tr bgcolor="#ECF3FD">
					<td width="25%"></td>
					<td width="17%"><input type="submit"   value="添加"></td>
					<!-- <td width="17%"><input type="reset" name="reset"  value="重置"></td>
					<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td> -->
					<td width="43%"></td>
	</tr>
 </table>

<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
<!-- 	<tr bgcolor="#ECF3FD">
					<td width="25%"></td>
					<td width="17%"><input type="submit" name="submit"  value="添加"></td>
					<td width="17%"><input type="reset" name="reset"  value="重置"></td>
					<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
					<td width="43%"></td>
	</tr> -->
</table>
</form>
  </body>
</html>

