<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
	<link rel="stylesheet" type="text/css" href="css/flag.css"/>
	</head>
	<body>
	<s:debug></s:debug>
		<center>
			<table border="0">
				<tr>
					<td bgcolor="gray">ID</td>
					<td bgcolor="gray">����</td>
					<td bgcolor="gray">ʱ��</td>
					<td bgcolor="gray">������</td>
					<td bgcolor="gray">����1</td>
					<td bgcolor="gray">����2</td>
				</tr>			
				<s:iterator value="informations">
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="title"/></td>
						<td><s:property value="time"/></td>
						<td><s:property value="manager.name"/></td>
						<td><a href="informationAction!delete.action?infoId=<s:property value="id"/>">ɾ��</a></td>
						<td><a href="informationAction!look.action?infoId=<s:property value="id"/>">�鿴����</a></td>
					</tr>
    			</s:iterator>
    
			</table>
		</center>
	</body>
</html>