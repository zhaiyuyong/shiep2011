<%@ page language="java"  pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<STYLE type="text/css">
		*{
	margin: 0;
	padding: 0;
}
		body {
	background: url("images/indexceneral.jpg");
}
div#leftsaide{
	
	border-right: 2px solid gray;
	width: 250px;
	height: 643px;
	float: left;
}
div#login{
	border: 0px solid gray;
	margin-top: 200px;
}
font {
	font-family: "Times New Roman","楷体";
	font-size: 7px;
}
div#rightside{
	border: 0px solid blue;
	
	float: left;
	width: 600px;
	height: 620px;
}
		
		</STYLE>
	
	</head>
	<body>
	
	
	<div id="leftsaide">
	<div style="color: red;"> <s:property value="error"/> </div>
	<div id="login"> 
	  <form action="student" method="post">
	   <table border="0">
	   		<tr>
	   			<td>用户名：</td>
	   			<td><input type="text" name="username" ></td>
	   		</tr>
	   		<tr>
	   			<td>&nbsp;</td>
	   			<td><font color="red">用户名是你的学号如 20091722</font> </td>
	   		</tr>
	   		<tr>
	   			<td>密码:</td>
	   			<td><input type="password" name="password" ></td>
	   		</tr>
	   		
	   		<tr>
	   			<td align="center">&nbsp;</td>
	   			<td align="center"><input type="submit" value="登陆">&nbsp;&nbsp;<input type="reset" value="重置"> </td>
	   		</tr>
	   </table>
	   
	  </form>
	  </div>
	  </div>
	  
	  <div id="rightside">
	  
	  </div>
	  
	  
	
	</body>
</html>