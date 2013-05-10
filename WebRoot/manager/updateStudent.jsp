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
	  <form action="studentAction!update.action" method="post" name="form1">
	   <table border="0">
	   		<tr>
	   			<td>ID:</td>
	   			<td><input type="text" name="id" value="<s:property value="student.id"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>学号:</td>
	   			<td><input type="text" name="stuNo" value="<s:property value="student.stuNo"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>姓名:</td>
	   			<td><input type="text" name="stuName" value="<s:property value="student.stuName"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>性别:</td>
	   			<td><input type="text" name="sex" value="<s:property value="student.sex"/>"></td>	
	   		</tr>
	   		<tr>
	   			<td>密码:</td>
	   			<td><input type="text" name="password" value="<s:property value="student.password"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>email:</td>
	   			<td><input type="text" name="email" value="<s:property value="student.email"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>学院:</td>
	   			<td><input type="text" name="dept" value="<s:property value="student.dept"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>班级:</td>
	   			<td><input type="text" name="classNo" value="<s:property value="student.classNo"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>生日:</td>
	   			<td><input type="text" name="birth" value="<s:property value="student.birth"/>"></td>
	   		</tr>
	   		<tr>
	   			<td>地址:</td>
	   			<td><input type="text" name="address" value="<s:property value="student.address"/>"></td>
	   		</tr>
	   		<tr>
	   			<td align="center"><input type="submit" value="修改"></td>
	   			<td align="center"><input type="reset" value="重置"> </td>
	   		</tr>
	   </table>
	  </form>
	</center>
	</body>
</html>