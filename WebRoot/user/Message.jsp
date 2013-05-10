<%@ page language="java"  pageEncoding="utf-8"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	
	</head>
	<body>
	<s:debug></s:debug>
	<center>
	
	<table>
	<tr>
		
		<th>主题</th>
		<th>发件人</th>
		<th>发送时间</th>
	</tr>
	<s:iterator value="mails">
		<tr>
		
		<td><s:property value="subject"/></td>
		<td><s:property value="sender"/></td>
		<td><s:property value="senddate"/></td>
		</tr>
	 </s:iterator>
	</table>
	</center>
	
	</body>
</html>