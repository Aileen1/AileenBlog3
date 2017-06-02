<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
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

<title>登录页面</title>

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
<h1>用户登陆</h1>
<form action="${pageContext.request.contextPath}/user_login.action" method="post">
用户名:<input type="text" name="name"><br/>
密&nbsp&nbsp码:<input type="text" name="password"><br/>
<input type="submit" value="登录">
<s:actionerror />

</form>
</body>
</html>
