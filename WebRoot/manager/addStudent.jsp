<%@ page language="java"  pageEncoding="utf-8"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<!-- <link rel="stylesheet" type="text/css" href="css/ui.css"/>-->
	</head>
	<body>
	<s:debug></s:debug>
	<center>
	  <form action="studentAction!add.action" method="post">
	   <table border="0">
	   		<tr>
	   			<td>ID:</td>
	   			<td><input type="text" name="id" disabled="disabled"></td>
	   		</tr>
	   		<tr>
	   			<td>学号:</td>
	   			<td><input type="text" name="stuNo" ></td>
	   		</tr>
	   		<tr>
	   			<td>姓名:</td>
	   			<td><input type="text" name="stuName" ></td>
	   		</tr>
	   		<tr>
	   			<td>性别:</td>
	   			<td><input type="text" name="sex" ></td>	
	   		</tr>
	   		<tr>
	   			<td>密码:</td>
	   			<td><input type="text" name="password" ></td>
	   		</tr>
	   		<tr>
	   			<td>email:</td>
	   			<td><input type="text" name="email" ></td>
	   		</tr>
	   		<tr>
	   			<td>学院:</td>
	   			<td><input type="text" name="dept" ></td>
	   		</tr>
	   		<tr>
	   			<td>班级:</td>
	   			<td><input type="text" name="classNo" ></td>
	   		</tr>
	   		<tr>
	   			<td>生日:</td>
	   			<td><input type="text" name="birth" ></td>
	   		</tr>
	   		<tr>
	   			<td>地址:</td>
	   			<td><input type="text" name="address" ></td>
	   		</tr>
	   		<tr>
	   			<td align="center"><input type="submit" value="添加"></td>
	   			<td align="center"><input type="reset" value="重置"> </td>
	   		</tr>
	   </table>
	  </form>
	</center>
	</body>
</html>