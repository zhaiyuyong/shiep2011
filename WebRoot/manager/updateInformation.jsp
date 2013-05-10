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

	<form action="informationAction!update.action" method="post">
	   <table border="0">
	   		<tr>
	   			<td>ID:</td><td><input type="text" name="id" value="<s:property value="information.id"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>标题:</td><td><input type="text" name="title" value="<s:property value="information.title"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>内容:</td><td><textarea rows="15" cols="100" name="content" ><s:property value="information.content"/></textarea></td>
	   		</tr>
	   		<tr>
	   			<td>发布人:</td><td><input type="text" name="manager_name" value="<s:property value="information.manager.name"/>"> </td>
	   		</tr>
	   		<tr>
	   			<td><input type="submit" value="修改"></td>
	   			<td><input type="reset" value="重置"> </td>
	   		</tr>
	   </table>
	  </form>
	  </center>
	</body>
</html>