<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>新闻动态</title>
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
 <style type="text/css">
 td {
          
            border-bottom:1px solid #95bce2;
            
            text-align:center;
        }
        tr.alt td {
        background:#ecf6fc; /*这行将给所有的tr 加上背景色*/
        }
        tr.over td {
        background:#bcd4ec; /*这个将是鼠标高亮行的背景色*/
        }
        
 
 </style>
 <script type="text/javascript" src="manager/js/jquery.js"></script>
	<script type="text/javascript">

        $(document).ready(function(){ //这个就是传说的ready
        $(".stripe tr").mouseover(function(){
//如果鼠标移到class 为stripe 的表格的tr 上时，执行函数
        $(this).addClass("over");}).mouseout(function(){
//给这行添加class 值为over，并且当鼠标一出该行时执行函数
        $(this).removeClass("over");}) //移除该行的class
        $(".stripe tr:even").addClass("alt");
//给class 为stripe 的表格的偶数行添加class 值为alt
});

    </script>
</head>

<body>

<div id="main-wrapper">

	<%@include file="top.jsp" %>
	<s:debug></s:debug>
	 <div id="main-content">
	 <div id="content-bg">

		
     <center>
     <table border=0 width=708 class="stripe" cellspacing="0"cellpadding="0">
    <s:iterator value="informations">
       <tr>
        <td><div align="left">
        <li><h3 ><a href="indexAction!info?info=<s:property value="id"/>"><s:property value="title"/></a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<s:property value="time"/></h3>
		</li></div>
        </td>
        <td>&nbsp;</td> 
        <td>&nbsp;</td> 
        <td>&nbsp;</td>       
       </tr>
    </s:iterator>
     	<tr>
        	<td><div align="right">
			<a href="indexAction!all?page=1">第一页</a></div></td>
        	<td>
        	<a href="indexAction!all?page=<s:property value="page-1"/>">上一页</a></td>			
        	<td>
			<a href="indexAction!all?page=<s:property value="page+1"/>">下一页</a></td>
        	<td  colspan=3><a href="indexAction!all?page=<s:property value="maxpage"/>">最后一页</a></td>        	
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