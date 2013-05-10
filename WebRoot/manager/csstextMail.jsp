<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>企业邮箱-写信</title>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
ul li{
	list-style: none;
}
font{
	list-style: none;
	width: 50px;
}
a{
	color: #26670D;
	text-decoration: none;	
}
div#wraper {

	border: 0px dashed;
	margin: 16px;
	
	width: 1000px;
	height: 550px;
	background: url("images/indexceneral.jpg");
}
div#header {
	border: 0px dashed;
	width: 990px;
	height: 50px;
	background: url("images/head.gif")repeat;
	margin: 5px auto;
}
div#header ul{
	border: 0px dashed blue;
	margin: 5px;
	height: 40px;
	width: 940px;
	
	
}
div#header ul li{
	border: 0px dashed;
	float: left;
	margin: 10px 10px 0 5px;
}
div#header ul li input{
	
	height: 20px;
}

div#center {
	border: 0px dashed;
	margin: 5px auto;
	width: 990px;
	height: 425px;
	background:url("images/bg.gif") repeat;
}
div#left {
	border: 0px dashed;
	margin: 5px;
	float: left;
	width: 700px;
	height: 410px;
	
}
div#left ul{
	border: 0px dashed;
	float: inherit;
	margin: 5px;
	width: 690px;	
}
div#left ul li{
	border: 0px dashed;
	margin: 5px 5px 5px 5px;
	float: left;
}
div#left ul li input{
	margin: 3px 2px 2px 5px;
	font-family: "Times New Roman","楷体";	
	width: 590px;
	float: left;
}
div#left ul li font{
	margin: 2px 2px 2px 2px;
	font-family: "Times New Roman","楷体";	
	border: 0px dashed blue;
	width: 50px;
	float: left;
}
div#left ul li a{
	font-family: "Times New Roman","楷体";
	color: blue;
}
div#right {
	
	border-left:0px dashed blue;
	margin: 5px;
	float: left;
	width: 265px;
	height: 410px;
	
}
div#right ul{
	border: 0px dashed;
}
.textfoe1{
	margin: 30px 0 30px 0;
	
}

</style>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function fasong2(){
		alert($("#shoujianre").val());
		alert($("#subject").val());
		alert($("#content").val());
	}
	function fasong(messid,stuid,name) {
		
		 var url = "sendeamilAction";
	    url = convertURL(url);
	    $.post(url,{Action: "post", content:$("#content").val(),subject:$("#subject").val(),shoujianre:$("#shoujianrenemail").val()},function(data){
	        $("#wraper").html(data);
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
	function verify() {
		//alert($("#userName").val());
		 var url = "searchstuAction";
	    url = convertURL(url);
	    $.post(url,{Action: "post", name:$("#userName").val() },function(data){
	        //$("#result").html(data);
	    	$("#shoujianrenemail").val(data);
	    });
	  
	}
</script>
    
  </head>
  
  <body>
  
 <div id="wraper">
 	<div id="header">
 		<ul>
 			<li><input type="button" value="发送" onclick="fasong()"> </li>
 			<li><input type="button" value="定时发送"></li>
 			<li><input type="button" value="存草稿箱"></li>
 			<li><input type="button" value="取消"></li>
 		</ul>
 	</div>
 	<div id="center">
 		<div id="left">
 		<div id="result" style="margin-left: 50px;"></div>
 		<ul>
 			<li><font>收件人</font><input type="text" name="shoujianre" id="shoujianrenemail" ></li>
 		</ul>
 		 <ul id="haha">
 		    <li><a href=""></a></li>
 			<li><a href="">添加抄送</a></li>
 			<li><a href="">添加密送</a></li>
 			<li><a href="">分别发送</a></li>
 		</ul>
 		<ul>
 			<li><font>主题</font><input type="text" name="subject" id="subject"></li>
 		</ul>
 		 <ul id="haha">
 		 	<li><a href=""></a></li>
 			<li><a href="">添加附件</a></li>
 			<li><a href="">超大附件</a></li>
 			<li><a href="">照片</a></li>
 			<li><a href="">表情</a></li>
 			<li><a href="">截屏</a></li>
 			<li><a href="">音乐</a></li>
 			<li><a href="">文件格式</a></li>
 		</ul>
 		<ul id="haha">
 		 	<li><font class="textfoe1">正文</font><textarea rows="12" cols="83" name="content" id="content"></textarea> </li>
 		</ul>
 		<ul id="haha">
 			<li><a href="">发件人：${current_manager}</a></li>
 		</ul>
 			
 		</div>
 		<div id="right">
 			<ul style="width: 255px;height: 50px; margin: 5px auto;">
 				<li style="margin: 0px auto;"><a href="" style="background-color: white;">联系人</a></li>
 				<li style="border: 1px dashed;width: 245px;margin: 2px auto;"><input style="width: 245px;"  type="text" name="lianxiren" id="userName" value="查找联系人..." onkeyup="verify()"/> </li>
 			 </ul>
 			<ul style="width: 255px;height: 100px; margin: 5px auto; background-color: white;">
 				<li><p>邮箱联系人</p></li>
 				<li></li>
 			</ul>
 			<ul style="width: 255px;height: 240px; margin: 5px auto; background-color: white;"></ul>
 		</div>
 	</div>
 	<div id="header">
 		<ul>
 			<li><input type="button" value="发送" onclick="fasong()"> </li>
 			<li><input type="button" value="定时发送"></li>
 			<li><input type="button" value="存草稿箱"></li>
 			<li><input type="button" value="取消"></li>
 		</ul>
 	</div>
 </div>
  
  
  
  
  
  
  
  
	<%--<h2>发送文本型邮件</h2><hr>
	<form action="sendMail.jsp" method="post" name="sendMailForm">
		SMTP服务器：<input type="text" id="SMTPHost" name="SMTPHost"><br>
		登陆账号：<input type="text" id="user" name="user"><br>
		登陆密码：<input type="password" id="password" name="password"><br>
		发件人邮箱：<input type="text" id="from" name="from"><br>
		收件人邮箱：<input type="text" id="to" name="to"><br>
		邮件标题：<input type="text" id="subject" name="subject"><br>
		邮件内容：<textarea rows="5" cols="40" id="content" name="content"></textarea> <br><br>
			<input type="submit" value="发送">&nbsp;
			<input type="reset" value="重置">
	</form>

  --%></body>
</html>
