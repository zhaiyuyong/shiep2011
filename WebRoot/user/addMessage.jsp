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
	   <form action="stumessageAction!add.action" method="post">
	   <table border="0">
	   		
	   		<tr>
	   			<td>内容:</td><td><textarea rows="15" cols="100" name="content"></textarea></td>
	   		</tr>
	   		<tr>
	   			<td>发布人:</td><td>${stu_no}</td>
	   		</tr>
	   		<tr>
	   			<td><input type="submit" value="发布"></td>
	   			<td><input type="reset" value="重置"> </td>
	   		</tr>
	   </table>
	  </form>
	</center>
	</body>
</html>