<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>查询合同信息</title>

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
var  highlightcolor='#c1ebff';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
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

	<%--   <%
						UserInfo  userInfo  =   (UserInfo)request.getSession().getAttribute("userInfo2");
			 %>  --%>
	<form action="<%=basePath%>StaffNameSelectContractVo" method="post">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td height="30" background="<%=basePath%>resource/images/tab_05.gif">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="12" height="30"><img
								src="<%=basePath%>resource/images/tab_03.gif" width="12"
								height="30" /></td>
							<td><table width="100%" border="0" cellspacing="0"
									cellpadding="0">
									<tr>
										<td class="STYLE4" align="center">&nbsp;&nbsp;请输入查询内容：<input
											type="text" name="userName" style="width: 290px" /></td>
										<td class="STYLE4">&nbsp;&nbsp;请选择查询方式：<select
											name="queryType" style="width: 100px">
												<c:if test="${list.SPid==1}">
													<option value="1">员工姓名</option>
												</c:if>
												<option value="2">客户名称</option>
										</select>
										</td>
										<td class="STYLE4">&nbsp;&nbsp;<input type="submit"
											value="查询" style="width: 50px" /></td>
									</tr>
								</table></td>
							<td width="16"><img
								src="<%=basePath%>resource/images/tab_07.gif" width="16"
								height="30" /></td>
						</tr>
					</table>
				</td>
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
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 10%"><div align="center">
												<span class="STYLE1">合同编号</span>
											</div></td>
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 15%"><div align="center">
												<span class="STYLE1">合同内容</span>
											</div></td>
										<%-- <td height="22" background="<%=basePath%>resource/images/bg2.gif" bgcolor="#FFFFFF" style="width: 15%"><div align="center"><span class="STYLE1">购买产品</span></div></td> --%>
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 10%"><div align="center">
												<span class="STYLE1">客户名称</span>
											</div></td>
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 10%"><div align="center">
												<span class="STYLE1">负责人</span>
											</div></td>
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 10%"><div align="center">
												<span class="STYLE1">合同状态</span>
											</div></td>
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 10%"><div align="center">
												<span class="STYLE1">总金额</span>
											</div></td>
										<%-- <td height="22" background="<%=basePath%>resource/images/bg2.gif" bgcolor="#FFFFFF" style="width: 5%"><div align="center"><span class="STYLE1">已收金额</span></div></td> --%>
										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											style="width: 15%"><div align="center">
												<span class="STYLE1">签订时间</span>
											</div></td>
										<%-- <td height="22" background="<%=basePath%>resource/images/bg2.gif" bgcolor="#FFFFFF" style="width: 15%"><div align="center"><span class="STYLE1">失效时间</span></div></td> --%>

										<td height="22" background="<%=basePath%>" bgcolor="#FFFFFF"
											class="STYLE1" style="width: 20%"><div align="center">基本操作</div></td>
									</tr>

									<%--           <% List<UserInfo> list = (List<UserInfo>)request.getAttribute("list");
				if(list!=null && list.size()>0){
				for(int i=0;i<list.size();i++){ 
					UserInfo user = list.get(i);
				%>  --%>
									<c:if test="${queryType==0}">
										<c:forEach items="${conlist}" var="li">
											<tr>
												<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
														align="center" class="STYLE1">
														<div align="center">${li.CONId}</div>
													</div></td>
												<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
														align="center">
														<span class="STYLE1">${li.CONPhotograph}</span>
													</div></td>
												<%-- <td height="20" bgcolor="#FFFFFF" style="width: 3%"><div align="center"><span class="STYLE1"><%=user.getUserSex() %> </span></div></td> --%>
												<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
														align="center">
														<span class="STYLE1">${li.clientVo.CName}</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
														align="center">
														<span class="STYLE1">${li.staffVo.SName} </span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
														align="center">
														<span class="STYLE1">${li.CONConstate}</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
														align="center">
														<span class="STYLE1">${li.CONMoney}</span>
													</div></td>
												<%-- <td height="20" bgcolor="#FFFFFF" style="width: 5%"><div align="center"><span class="STYLE1"><%=user.getUserDiploma() %> </span></div></td> --%>
												<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
														align="center">
														<span class="STYLE1">${li.CONTime}</span>
													</div></td>
												<%-- <td height="20" bgcolor="#FFFFFF" style="width: 15%"><div align="center"><span class="STYLE1"><%=user.getUserAddress() %></span></div></td> --%>

												<td height="20" bgcolor="#FFFFFF" style="width: 14%">
													<div align="center">
														<span class="STYLE4"> <span> <img
																<%--  <%   if  (userInfo.getRolePower()  !=  3 &&  userInfo.getRolePower()  !=  4 ) {%> style=" display: none  "  <%}%> --%>   src="<%=basePath%>resource/images/edt.gif"
																width="16" height="16" /> <a<%--  <%   if  (userInfo.getRolePower()  !=  3 &&  userInfo.getRolePower()  !=  4 ) {%> style=" display: none  "  <%}%>    href="<%=basePath %>servlet/UserUpdateServlet?id=<%=user.getUserId()%>" --%> >编辑</a>&nbsp;
																<img src="<%=basePath%>resource/images/edt.gif"
																width="16" height="16" /> <a<%-- href="<%=basePath %>servlet/UserQueryMoreServlet?id=<%=user.getUserId()%>" --%>>详情</a>&nbsp;
														</span>
													</div>
												</td>

											</tr>
										</c:forEach>

									</c:if>
									<c:if test="${queryType==1}">
										<c:if test="${staff.contracts==null}">
											<tr>
												<td height="20" bgcolor="#FFFFFF" colspan="21"
													align="center">
													<div align="center">
														<span class="STYLE1">没有合同相关信息</span>
													</div>
												</td>
											</tr>
										</c:if>
										<c:forEach items="${sta}" var="staff">
											<c:forEach items="${staff.contracts}" var="con">
												<tr>
													<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
															align="center" class="STYLE1">
															<div align="center">${con.CONId}</div>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${con.CONPhotograph}</span>
														</div></td>
													<%-- <td height="20" bgcolor="#FFFFFF" style="width: 3%"><div align="center"><span class="STYLE1"><%=user.getUserSex() %> </span></div></td> --%>
													<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
															align="center">
															<span class="STYLE1">${con.clientVo.CName}</span>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
															align="center">
															<span class="STYLE1">${con.staffVo.SName} </span>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${con.CONConstate}</span>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${con.CONMoney}</span>
														</div></td>
													<%-- <td height="20" bgcolor="#FFFFFF" style="width: 5%"><div align="center"><span class="STYLE1"><%=user.getUserDiploma() %> </span></div></td> --%>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${con.CONTime}</span>
														</div></td>
													<%-- <td height="20" bgcolor="#FFFFFF" style="width: 15%"><div align="center"><span class="STYLE1"><%=user.getUserAddress() %></span></div></td> --%>

													<td height="20" bgcolor="#FFFFFF" style="width: 14%">
														<div align="center">
															<span class="STYLE4"> <span> <img
																	<%--  <%   if  (userInfo.getRolePower()  !=  3 &&  userInfo.getRolePower()  !=  4 ) {%> style=" display: none  "  <%}%> --%>   src="<%=basePath%>resource/images/edt.gif"
																	width="16" height="16" /> <a<%--  <%   if  (userInfo.getRolePower()  !=  3 &&  userInfo.getRolePower()  !=  4 ) {%> style=" display: none  "  <%}%>    href="<%=basePath %>servlet/UserUpdateServlet?id=<%=user.getUserId()%>" --%> >编辑</a>&nbsp;
																	<img src="<%=basePath%>resource/images/edt.gif"
																	width="16" height="16" /> <a<%-- href="<%=basePath %>servlet/UserQueryMoreServlet?id=<%=user.getUserId()%>" --%>>详情</a>&nbsp;
															</span>
														</div>
													</td>

												</tr>
												<c:if test="${con==null}">
													<tr>
														<td height="20" bgcolor="#FFFFFF" colspan="21"
															align="center">
															<div align="center">
																<span class="STYLE1">没有合同相关信息</span>
															</div>
														</td>
													</tr>
												</c:if>
											</c:forEach>
										</c:forEach>

									</c:if>
									<c:if test="${queryType==2}">
										<c:forEach items="${client}" var="client">
											<c:forEach items="${client.contracts}" var="c">
												<tr>
													<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
															align="center" class="STYLE1">
															<div align="center">${c.CONId}</div>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${c.CONPhotograph}</span>
														</div></td>
													<%-- <td height="20" bgcolor="#FFFFFF" style="width: 3%"><div align="center"><span class="STYLE1"><%=user.getUserSex() %> </span></div></td> --%>
													<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
															align="center">
															<span class="STYLE1">${c.clientVo.CName}</span>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 3%"><div
															align="center">
															<span class="STYLE1">${c.staffVo.SName} </span>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${c.CONConstate}</span>
														</div></td>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${c.CONMoney}</span>
														</div></td>
													<%-- <td height="20" bgcolor="#FFFFFF" style="width: 5%"><div align="center"><span class="STYLE1"><%=user.getUserDiploma() %> </span></div></td> --%>
													<td height="20" bgcolor="#FFFFFF" style="width: 5%"><div
															align="center">
															<span class="STYLE1">${c.CONTime}</span>
														</div></td>
													<%-- <td height="20" bgcolor="#FFFFFF" style="width: 15%"><div align="center"><span class="STYLE1"><%=user.getUserAddress() %></span></div></td> --%>

													<td height="20" bgcolor="#FFFFFF" style="width: 14%">
														<div align="center">
															<span class="STYLE4"> <span> <img
																	<%--  <%   if  (userInfo.getRolePower()  !=  3 &&  userInfo.getRolePower()  !=  4 ) {%> style=" display: none  "  <%}%> --%>   src="<%=basePath%>resource/images/edt.gif"
																	width="16" height="16" /> <a<%--  <%   if  (userInfo.getRolePower()  !=  3 &&  userInfo.getRolePower()  !=  4 ) {%> style=" display: none  "  <%}%>    href="<%=basePath %>servlet/UserUpdateServlet?id=<%=user.getUserId()%>" --%> >编辑</a>&nbsp;
																	<img src="<%=basePath%>resource/images/edt.gif"
																	width="16" height="16" /> <a<%-- href="<%=basePath %>servlet/UserQueryMoreServlet?id=<%=user.getUserId()%>" --%>>详情</a>&nbsp;
															</span>
														</div>
													</td>

												</tr>
												<c:if test="${c==null}">
													<tr>
														<td height="20" bgcolor="#FFFFFF" colspan="21"
															align="center">
															<div align="center">
																<span class="STYLE1">没有合同相关信息</span>
															</div>
														</td>
													</tr>
												</c:if>
											</c:forEach>
										</c:forEach>

									</c:if>



									<%-- <%}}else{ %> --%>
									<%-- <c:if test="${li==null&&con==null&&c==null}">
										<tr>
											<td height="20" bgcolor="#FFFFFF" colspan="21" align="center">
												<div align="center">
													<span class="STYLE1">没有合同相关信息</span>
												</div>
											</td>
										</tr>
									</c:if> --%>
									<%-- <%} %> --%>
								</table></td>
							<td width="8"
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
										<td class="STYLE4">&nbsp;&nbsp;共有<%--  <%= list.size() %>  --%>条记录，当前第
											1/1 页
										</td>
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
