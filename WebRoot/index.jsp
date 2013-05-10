<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java"  pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>我的电院</title>
<meta http-equiv="x-ua-compatible" content="ie=7" /> 
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
</head>

<body>
<div id="main-wrapper">

<%@ include file="top.jsp" %>
<div id="main-content">
  <div id="content-bg">
  <s:debug></s:debug>
	<%@include file="right.jsp" %>
	<div id="top-news">
	<img src="images/news.gif"></img>
		<div id="wrap">
			<ul>
				
				<s:iterator value="informations">
					<li>
						<h1><a href="indexAction!info?info=<s:property value="id"/>"><s:property value="title"/></a></h1>
						<h3><s:property value="time"/></h3>
					</li>
				</s:iterator>			
			</ul>
			<div align="right"><a href="indexAction!all"><h2>更多公告</h2></a></div>
		</div>
	</div>	
	<div id="top-news">
	<img src="images/info.gif"></img>
		<div id="wrap">
			<ul>
				<s:iterator value="informations">
					<li>
						<h1><a href="indexAction!info?info=<s:property value="id"/>"><s:property value="title"/></a></h1>
						<h3><s:property value="time"/></h3>
					</li>
				</s:iterator>				
			</ul>
			<div align="right"><a href="indexAction!all"><h2>更多公告</h2></a></div>
		</div>
	</div>	
	<div class="clear"></div>
</div>
</div>
<div id="main-content-bot"></div>
</div>
</body>
</html>