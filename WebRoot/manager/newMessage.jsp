<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>新闻动态</title>
<link type="text/css" rel="stylesheet" href="css/layout.css" title="default" media="all" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
function faceimg(id){
	//alert(id);
		$("#div"+id).show("slow");
		
}
function hideimg(id){
	//alert(id);
		$("#div"+id).hide("slow");
}


function verify(messid,stuid,name) {
	//alert(messid);
	//alert(name.value);
	//alert(stuid);
	 var url = "repajaxAction";
    url = convertURL(url);
    $.post(url,{Action: "post", content:name.value,studentid:stuid,messageid:messid},function(data){
        $("#div"+messid).html(data);
    });
  
}
//给url地址增加时间戳，骗过浏览器，不读取缓存
function convertURL(url) {
    //获取时间戳
    var timstamp = (new Date()).valueOf();
    //将时间戳信息拼接到url上
    //url = "AJAXServer"
    if (url.indexOf("?") >= 0) {
        url = url + "&t=" + timstamp;
    } else {
        url = url + "?t=" + timstamp;
    }
    return url;
}


</script>


</head>

<body>

<div id="main-wrapper">

	
	<s:debug></s:debug>
	 <div id="main-content">
	 <div id="content-bg">

		
     <center>
     
  		
			<s:iterator value="messages">
			
			<div style="border: 1px solid gray;margin-top: 10px;">
			   <p style="float: left;border: 1px solid gray;width: 300px;">
			   <font color="red"><s:property value="student.stuName"/></font>
			   在<s:property value="shijian"/>对<font color="red">你</font>说：</p>
			   <p style="float: left;border: 1px solid gray;margin-left: 10px;width: 600px;">
			   <s:property value="content"/></p><p style="float: right;margin-right: 15px;" >
			   <input type="button" value="回复" onclick="JavaScript:faceimg('<s:property value="id"/>');"/>
			   &nbsp;&nbsp;&nbsp;</p>
			
			
			<div style="clear: both;"></div>
			<div style=" border: 1px solid gray;margin-top: 10px;margin-left:300px; display: none;" id="div<s:property value="id"/>">
			     <input id="<s:property value="id"/>" type="text" name="repcontent" style="width: 600px;"></input>
			     <input type="button" value="回复" onclick="verify(<s:property value="id"/>,<s:property value="student.id"/>,document.getElementById(<s:property value="id"/>))"/>
			     <input type="button" value="取消" onclick="JavaScript:hideimg('<s:property value="id"/>');"/>
			</div>
			<div id="dd<s:property value="id"/>"></div>
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