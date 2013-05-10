<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<!-- <meta http-equiv="Content-Type" content="text/html; charset=GBK"> -->
		<script type="text/javascript" src="js/jquery.js"></script>
			<script type="text/javascript">
			
	function verify() {
	//alert($("#userName").val());
	 var url = "searchstuAction";
    url = convertURL(url);
    $.post(url,{Action: "post", name:$("#userName").val() },function(data){
        //$("#result").html(data);
    	$("#result").val(data);
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
	<s:debug></s:debug>
	<center>
		<input type="text" id="userName"  onkeyup="verify()"/>
		<input type="button" value="搜索" onclick="verify()"/>
		<div id="result1"></div>
	  <form action="informationAction!add.action" method="post" name="form2">
	   <table border="0">
	   		<tr>
	   			<td>学生ID:</td><td><input type="text" name="stuId" id="stuId" value="${param.stuId}">
	   			学生姓名:<input type="text" name="stuId" id="result" value="${param.stuId}">
	   		</tr>
	   		<tr>
	   			<td>标题:</td><td><input type="text" name="title"></td>
	   		</tr>
	   		<tr>
	   			<td>内容:</td><td><textarea rows="15" cols="100" name="content"></textarea></td>
	   		</tr>
	   		<tr>
	   			<td>发布人:</td><td>${current_manager}</td>
	   		</tr>
	   		<tr>
	   			<td><input type="submit" value="发布"></td>
	   			<td><input type="reset" value="重置"> </td>
	   		</tr>
	   </table>
	  </form>
	</center>
	</body>
</html>