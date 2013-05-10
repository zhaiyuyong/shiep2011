<%@ page language="java"  pageEncoding="gbk"%>

<html>
<head>

<title>后台管理工作平台</title>
</head>
<% 
	String usersid=request.getParameter("userid");
	request.setAttribute("userid","zhaiyuyong");
	
%>
<frameset rows="127,*,11" frameborder="no" border="0" framespacing="0">
	<frame src="top.jsp?userid=${userid}" name="topFrame" scrolling="no"
		noresize="noresize" id="topFrame" />
	<frame src="center.jsp" name="mainFrame" id="mainFrame" />
	<frame src="down.jsp" name="bottomFrame" scrolling="no"
		noresize="noresize" id="bottomFrame" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>