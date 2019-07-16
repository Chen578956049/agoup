<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html style="width: 100%;height: 100%;overflow: hidden;">
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="resource/jquery-easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="resource/jquery-easyui/themes/icon.css">

<!-- <script type="text/javascript" src="jquery-easyui/easyloader.js"></script> -->

<script type="text/javascript" src="resource/jquery-easyui/jquery.min.js"></script>
<script type="text/javascript" src="resource/jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="resource/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>


<!--  <script type="text/javascript">
$((function(){
	 $("#loginname").blur(function(){	   
		 var usn=$("#loginname").val();
		 if(usn==""){
			 $("#asd").text("用户名不能为空");
			
		 }
			if(!usn==""){
				 $("#asd").text("");
				
			}
	
 });
	 
	 $("#password").blur(function(){
			 var psd=$("#password").val();
			 if(psd==""){
			 $("#qwe").text("密码不能为空");
		 }
			 if(!psd==""){
				 $("#qwe").text("");
				
			}
	
	/* $("#btnLogin").click(function(){
		
	}); */
	
});
})); 
</script>  -->

</head>
<body  style="width: 100%;height: 100%;overflow: hidden;border: none;visibility: visible;">
	
	<div id="mainwindow" class="easyui-window" style="width: 500px;height:300px;background: #fafafa;overflow: hidden; z-index: 90061"
			title="登录" closed="false" modal="true" shadow="true"  border="false" closable="false" resizable="false" close="false" collapsible="false" draggable="false" minimizable="false" maximizable="false">
		<div class="header" style="height: 35px;">
			<div class="toptitle" style="margin-top: 5px;font-size: 20px;margin-left: 6px;">CRM管理系统</div>
		</div>		
		<div style="padding: 60px 0;">
			<div id="loginForm">
				<div style="padding-left: 150px;">
					<form action="login" method="post">
					<table cellpadding="0" cellspacing="3">
						<tr>
							<td>登录账号</td>
							<td><input name="usename" id="loginname" type="text" style="width: 114px;"/><span class="f_onShow" id="asd"></span></td>
						</tr>
						<tr>
							<td>登录密码</td>
							<td><input name="psw" id="password" type="password" style="width: 114px;"/><span class="f_onShow" id="qwe"></span></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td></td>
							<td>
							
								<input id="btnLogin" style="width: 70px;" class="easyui-linkbutton" type="submit" value="登录">
								<a id="resetBtn" style="width: 70px;" class="easyui-linkbutton" onclick="clearAll()"></a>
							</td>
						</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--<div class="window-mask" style="width: 100%;height: 100%;overflow: hidden;border: none;visibility: visible;z-index: 90060">
	</div>-->
</body>
</html>