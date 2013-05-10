<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*"  contentType="text/html; charset=gbk" pageEncoding="gbk" %>
<html>
<head>
<title>后台管理工作平台</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript" src="js/js.js"></script>
<script type="text/javascript" src="js/image.js"></script>
<script type="text/javascript">
function changimg(){
document.getElementById("result2").src="image.jsp?time=new Date()";
}
</script>
</head>
<body>
<div id="top"> </div>
<form id="loginForm" name="loginForm" action="manager" method="post">
  <div id="center">
    <div id="center_left"></div>
    <div id="center_middle" align=left>
      <div class="user">
        <label>用户名：
        <input type="text" name="username" id="username" />
        </label>
      </div>
      <div class="user" >
        <label>密　码：
        <input type="password" name="password" id="password" />
        </label>
      </div>
      <div class="chknumber">
        验证码：
        	<input name="yzm" type="text" id="yzm" maxlength="4" class="chknumber_input"/><img border=0 src="image.jsp" id="result2" onclick="changimg();">
      </div>
    </div>
    <div id="center_middle_right"></div>
    <div id="center_submit">
      <div class="button"> <input type="submit" maxlength="6" class="chknumber_input" value="登录"> </div>
      <div class="button"> <input type="reset" maxlength="6" class="chknumber_input"value="重置"> </div>
    </div>
    <div id="center_right"></div>
  </div>
</form>
<div id="footer"></div>
</body>
</html>
