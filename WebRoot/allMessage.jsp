<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>���Ŷ�̬</title>
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
</head>

<body>

<div id="main-wrapper">

	<%@include file="top.jsp" %>
	<s:debug></s:debug>
	 <div id="main-content">
	 <div id="content-bg">

		
     <center>
     
  		
			<s:iterator value="messages" id="zyy">
			
			<div style="border: 1px solid gray;margin-top: 10px;">
			   <p style="float: left;border: 1px solid gray;"><font color="red"><s:property value="student.stuName"/></font>��<s:property value="shijian"/>�Թ���Ա˵��</p>
			   <p><s:property value="content"/></p>
			 <div style="border: 1px solid gray;margin-bottom: 5px;margin-top: 5px;"> <s:if test="repmessages.{id}[0]>0">
			   ����Ա�� <font color="red"><s:property value="repmessages.{shijian}[0]"/></font>�ظ���
			     <font color="blue"><s:property value="repmessages.{content}[0]"/></font> 
			 </s:if>
			</div>
			</div>  
			</s:iterator>
     
        <div align="right">
			<a href="indexAction!message?page=1">��һҳ</a>
        	
        	<a href="indexAction!message?page=<s:property value="page-1"/>">��һҳ</a>			
        	
			<a href="indexAction!message?page=<s:property value="page+1"/>">��һҳ</a>
        	<a href="indexAction!message?page=<s:property value="maxpage"/>">���һҳ</a>       	
  		</div>
    
		</center>
		<div class="clear"></div>
	</div>
	</div>
<div id="main-content-bot"></div>
</div>

</body>
</html>