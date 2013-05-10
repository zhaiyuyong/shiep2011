<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java"  pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>新闻动态</title>
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
</head>

<body>

<div id="main-wrapper">

	<%@include file="top.jsp" %>
	 <div id="main-content">
	  <s:debug></s:debug>
	 <div id="content-bg">
		
		<center>
		<table border=0 width=708>
			<tr>
				<td>
					<div align="center"><h1><s:property value="infromation.title"/></h1></div>
				</td>
			</tr>
			<tr>
				<td>
					<div align="right">作者：<s:property value="infromation.manager.name"/>&nbsp;&nbsp;时间：<s:property value="infromation.time"/></div>
				</td>
			</tr>
			<tr>
				<td>
					<div align="left">&nbsp; &nbsp; &nbsp; &nbsp; <s:property value="infromation.content"/></div>
				</td>
			</tr>
			<tr>
				<td>
					<div align="center">					
					</div>
				</td>
			</tr>
		</table>
		</center>
		<div class="clear"></div>
	</div>
	</div>
<div id="main-content-bot"></div>
</div>

</body>
</html>