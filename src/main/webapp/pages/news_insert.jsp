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
		新闻编号：<input type="text" name="news.nid" value="10"><br>
		新闻标题：<input type="text" name="news.title" value="MLDN"><br>
		发布日期：<input type="text" name="news.pubdate" value="1999-10-10 11:11:12"><br>
		<input type="submit" value="发布">
		<input type="reset" value="重置">
	</form>
</body>
</html>
