<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title><s:text name="exception_title"></s:text> </title>

	</head>

	<body style="padding: 10px;background-color: #D6D3CE;">
	 <center><h2><s:text name="exception_title"></s:text></h2></center>
	 <font color="#FF0000"><b><s:text name="exception_prompt"></s:text></b></font>
	 
	 <textarea rows="22" cols="106">
	 	<s:property value="exception.message"/>
	 	<s:property value="exceptionStack"/>
	 </textarea>
		


	</body>
</html>