<%@ page language="java"  pageEncoding="gbk"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
	<link rel="stylesheet" type="text/css" href="css/ui.css"/>
	</head>
	<body>
	<s:debug></s:debug>
	<center>
	  <form action="studentAction!add.action">
	   <table border="0">
	   		<tr>
	   			<td>ID:</td>
	   			<td><input type="text" name="id" ></td>
	   		</tr>
	   		<tr>
	   			<td>ѧ��:</td>
	   			<td><input type="text" name="stuNo" ></td>
	   		</tr>
	   		<tr>
	   			<td>����:</td>
	   			<td><input type="text" name="stuName" ></td>
	   		</tr>
	   		<tr>
	   			<td>�Ա�:</td>
	   			<td><input type="text" name="sex" ></td>	
	   		</tr>
	   		<tr>
	   			<td>����:</td>
	   			<td><input type="text" name="password" ></td>
	   		</tr>
	   		<tr>
	   			<td>email:</td>
	   			<td><input type="text" name="email" ></td>
	   		</tr>
	   		<tr>
	   			<td>ѧԺ:</td>
	   			<td><input type="text" name="dept" ></td>
	   		</tr>
	   		<tr>
	   			<td>�༶:</td>
	   			<td><input type="text" name="classNo" ></td>
	   		</tr>
	   		<tr>
	   			<td>����:</td>
	   			<td><input type="text" name="birth" ></td>
	   		</tr>
	   		<tr>
	   			<td>��ַ:</td>
	   			<td><input type="text" name="address" ></td>
	   		</tr>
	   		<tr>
	   			<td align="center"><input type="submit" value="���"></td>
	   			<td align="center"><input type="reset" value="����"> </td>
	   		</tr>
	   </table>
	  </form>
	</center>
	</body>
</html>