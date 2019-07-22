<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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

<title>My JSP 'linkrecord_list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.STYLE1 {
	font-size: 12px
}

.STYLE3 {
	font-size: 12px;
	font-weight: bold;
}

.STYLE4 {
	color: #03515d;
	font-size: 12px;
}

a {
	text-decoration: none;
	color: #033d61;
	font-size: 12px;
}

A:hover {
	COLOR: #f60;
	TEXT-DECORATION: underline
}
-->
</style>

<script>

function add(){
			//只提交到doGet方法
			window.location.href = "<%=basePath%>preAdd";
}
var  highlightcolor='#c1ebff';

var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
</head>

<body>


	<form action=""
		method="post">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="30" background="/resource/images/tab_05.gif"><table
						width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="12" height="30"><img
								src="<%=basePath%>resource/images/tab_03.gif" width="12"
								height="30" /></td>
							<td><table width="100%" border="0" cellspacing="0"
									cellpadding="0">
									<tr>
											
										<!-- 如果是总经理则可以根据员工姓名查询日志信息,但不能添加日志 -->
										<c:if test="${sessionScope.list.SPid==1 }">
											<td class="STYLE4" align="center">&nbsp;&nbsp;请输入查询内容：<input
												type="text" name="whoLinkInput" style="width: 290px" /></td>
											<td class="STYLE4">&nbsp;&nbsp;<input type="submit"
												value="查询" style="width: 50px" /></td>
										</c:if> 
										
										<!-- 如果是员工则可以根据客户姓名查询日志信息和添加日志信息 -->
										<c:if test="${sessionScope.list.SPid==2 }">
											<td class="STYLE4" align="center">&nbsp;&nbsp;请输入查询内容：<input
												type="text" name="whoLinkInput" style="width: 290px" /></td>
											<td class="STYLE4">&nbsp;&nbsp;<input type="submit"
												value="查询" style="width: 50px" /></td>
											<td class="STYLE4">&nbsp;&nbsp;<input type="button"
												value="添加" onclick="add()" style="width: 50px" /></td>
										</c:if>
									</tr>
								</table></td>
							<td width="16"><img
								src="<%=basePath%>resource/images/tab_07.gif" width="16"
								height="30" /></td>
						</tr>
					</table></td>
			</tr>


			<tr>
				<td><table width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td width="8"
								background="<%=basePath%>resource/images/tab_12.gif">&nbsp;</td>
							<td><table width="100%" border="0" cellpadding="0"
									cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"
									onmouseout="changeback()">
									<tr>
										<td width="4%" height="22"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE1">序号</span>
											</div></td>
										<td width="7%" height="22"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE1">客户姓名</span>
											</div></td>
										<td width="10%"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE1">联系时间</span>
											</div></td>

										<td width="10%" height="22"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE1">下次联系时间</span>
											</div></td>

										<td width="10%" height="22"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE1">联系人</span>
											</div></td>
										<td width="20%" height="22"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE1">联系内容</span>
											</div></td>

										<td style="display: none" width="15%" height="22"
											background="<%=basePath%>resource/images/bg2.gif"
											bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div></td>
									</tr>
									<c:choose>
									<c:when test="${list.size()>0}">
									<%int i = 1; %>
										<c:forEach items="${list}" var="log">
											<tr>
												<td height="20" bgcolor="#FFFFFF"><div align="center">
														<span class="STYLE1"><%=i %></span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF"><div align="center">
														<span class="STYLE1">${log.cvo.CName }</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF"><div align="center">
														<span class="STYLE1">${log.lTime }</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF"><div align="center">
														<span class="STYLE1">${log.lNtime }</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF"><div align="center">
														<span class="STYLE1">${log.svo.SName}</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF"><div align="center">
														<span class="STYLE1">${log.lScheduling }</span>
													</div></td>
												<td style="display: none" height="20" bgcolor="#FFFFFF"><div
														align="center">
														<span class="STYLE4"><img
															src="<%=basePath%>resource/images/del.gif" width="16"
															height="16" /><a
															href="<%=basePath%>servlet/LinkRecordDeleteServlet?recordId=">删除</a></span>
													</div></td>
											</tr>
											<% i++;%>
										</c:forEach>
									</c:when>

									<c:otherwise>
										<tr>
											<td height="20" bgcolor="#FFFFFF" colspan="9" align="center"><span
												class="STYLE1">没有数据！</span></td>
										</tr>
									</c:otherwise>
									</c:choose>
								</table></td>
							<td width="9"
								background="<%=basePath%>resource/images/tab_15.gif">&nbsp;</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td height="35" background="<%=basePath%>resource/images/tab_19.gif"><table
						width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="12" height="35"><img
								src="<%=basePath%>resource/images/tab_18.gif" width="12"
								height="35" /></td>
							<td><table width="100%" border="0" cellspacing="0"
									cellpadding="0">
									<tr>
										<td class="STYLE4">&nbsp;&nbsp;共有${list.size()}条记录，当前第 1/1 页</td>
										<td><table border="0" align="right" cellpadding="0"
												cellspacing="0">
												<tr>
													<td width="40"><img
														src="<%=basePath%>resource/images/first.gif" width="37"
														height="15" /></td>
													<td width="45"><img
														src="<%=basePath%>resource/images/back.gif" width="43"
														height="15" /></td>
													<td width="45"><img
														src="<%=basePath%>resource/images/next.gif" width="43"
														height="15" /></td>
													<td width="40"><img
														src="<%=basePath%>resource/images/last.gif" width="37"
														height="15" /></td>
													<td width="100"><div align="center">
															<span class="STYLE1">转到第 <input name="textfield"
																type="text" size="4"
																style="height: 12px; width: 20px; border: 1px solid #999999;" />
																页
															</span>
														</div></td>
													<td width="40"><img
														src="<%=basePath%>resource/images/go.gif" width="37"
														height="15" /></td>
												</tr>
											</table></td>
									</tr>
								</table></td>
							<td width="16"><img
								src="<%=basePath%>resource/images/tab_20.gif" width="16"
								height="35" /></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
</body>
</html>
