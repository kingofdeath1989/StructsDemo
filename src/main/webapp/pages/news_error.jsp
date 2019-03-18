<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>Struts 2.x 开发实战</title>
</head>
<body>
	<form action="NewsAction!insert.action" method="post">
		<span id="news.nidMsg">${fieldErrors['news.nid'][0]}</span><br>
		aaa
	</form>

</body>
</html>
