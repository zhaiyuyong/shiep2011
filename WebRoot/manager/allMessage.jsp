<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>新闻动态</title>
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
</head>

<body>

<div id="main-wrapper">


	<s:debug></s:debug>
	 <div id="main-content">
	 <div id="content-bg">

		
     <center>
     
  		
			<s:iterator value="messages">
			
			<div style="border: 1px solid blue;margin-top: 10px;">
			
			   <p style="float: left;border: 1px solid gray; float: left;"><font color="red"><s:property value="student.stuName"/></font>在<s:property value="shijian"/>对管理员说：</p>
			   <p style="float: left;border: 1px solid gray;margin-left: 10px;width: 600px;"><s:property value="content"/></p>
			   <p style="float: right;margin-right: 10px;"><a href="messageAction!delete.action?messid=<s:property value="id"/>">删除</a></p>
			
			
			 <div style="clear: both;"></div>
			 
			</div> 
			<div style="border: 1px solid gray;">
			 <p>管理员的回复：<font color="blue"><s:property value="repmessages.{content}[0]"/></font> </p>
			 </div> 
			 
			</s:iterator>
     
       
    
		</center>
		<div class="clear"></div>
	</div>
	</div>
<div id="main-content-bot"></div>
</div>

</body>
</html>