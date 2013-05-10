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
	   <form action="geteamilAction" method="post">
	   	登陆账号：<input type="text" id="user" name="user" ><br>
		登陆密码：<input type="password" id="password" name="password" ><br>
		<input type="submit" value="确定" name="sumbit">&nbsp;
		<input type="reset" value="重置" name="reset">
	  </form>
	</center>
	</body>
</html>