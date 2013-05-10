<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>���Ŷ�̬</title>
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
 <style type="text/css">
 td {
          
            border-bottom:1px solid #95bce2;
            
            text-align:center;
        }
        tr.alt td {
        background:#ecf6fc; /*���н������е�tr ���ϱ���ɫ*/
        }
        tr.over td {
        background:#bcd4ec; /*��������������еı���ɫ*/
        }
        
 
 </style>
 <script type="text/javascript" src="manager/js/jquery.js"></script>
	<script type="text/javascript">

        $(document).ready(function(){ //������Ǵ�˵��ready
        $(".stripe tr").mouseover(function(){
//�������Ƶ�class Ϊstripe �ı���tr ��ʱ��ִ�к���
        $(this).addClass("over");}).mouseout(function(){
//���������class ֵΪover�����ҵ����һ������ʱִ�к���
        $(this).removeClass("over");}) //�Ƴ����е�class
        $(".stripe tr:even").addClass("alt");
//��class Ϊstripe �ı���ż�������class ֵΪalt
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
			<a href="indexAction!all?page=1">��һҳ</a></div></td>
        	<td>
        	<a href="indexAction!all?page=<s:property value="page-1"/>">��һҳ</a></td>			
        	<td>
			<a href="indexAction!all?page=<s:property value="page+1"/>">��һҳ</a></td>
        	<td  colspan=3><a href="indexAction!all?page=<s:property value="maxpage"/>">���һҳ</a></td>        	
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