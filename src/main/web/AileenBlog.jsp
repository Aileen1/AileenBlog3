<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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

<title>My JSP 'AileenBlog.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<h1>Aileen的播客</h1>
	<s:if test="#session.existUser == null">
	<a href="${ pageContext.request.contextPath }/user_loginPage.action">登录|</a>
	<a href="${ pageContext.request.contextPath }/user_registPage.action">注册</a><br/>
    </s:if>
    <s:else>
   用户名: <s:property value="#session.existUser.name"/>|
    <a href="${ pageContext.request.contextPath }/user_quit.action">退出</a>
    </s:else>
<br/>
	<s:iterator value="obtainArticle" var="a">
		<s:property value="#a.id" />
		<s:property value="#a.title" />
		<a href="#">修改</a> &nbsp<a href="#">删除</a>
		<br/>
	</s:iterator>
	<a href="#">添加</a>
</body>
</html>
