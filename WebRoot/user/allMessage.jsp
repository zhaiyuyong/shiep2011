<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
		<STYLE type="text/css">
		td{
		  text-align: center;
		}
		
			td.class1{
	width: 20px;
}
			td.class2{
	width: 400px;
}
			td.class3{
	width: 100px;
}			td.class4{
	width: 50px;
}
		</STYLE>
	</head>
	<body>
	<s:debug></s:debug>
		<center>
			<table border="1">
				<tr>
				<th class="class1">ID</th>
				
				<th class="class2">内容</th>
				<th class="class3">时间</th>
				<th class="class4">状态</th>
				<th class="class2">管理员回复</th>
				</tr>
			<s:iterator value="messages">
			   <tr>
			      <td class="class1"><s:property value="id"/> </td>
			      
			      <td class="class2"><s:property value="content"/></td>
			      <td class="class3"><s:property value="shijian"/></td>
			      <td class="class4"><s:property value="flag"/></td>
			      <td class="class2"><s:property value="repmessages.{content}[0]"/></td>
			   </tr>
			   
			</s:iterator>
			</table>
		</center>
	</body>
</html>