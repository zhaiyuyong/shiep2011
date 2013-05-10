<%@ page language="java"  pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

<title>学生中心</title>

</head>
<% 
	String usersid=request.getParameter("userid");
	request.setAttribute("userid","zhaiyuyong");
%>
<frameset rows="100,550,60" frameborder="no" border="0" framespacing="0" >
	<frame src="header.jsp?userid=${userid}" name="topFrame" scrolling="no"
		noresize="noresize" id="topFrame" />
		
		<frame src="center.jsp" name="mainFrame" id="mainFrame" scrolling="no"/>
		
		<frame src="down.jsp" name="bottomFrame" scrolling="no"
		noresize="noresize" id="bottomFrame" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>