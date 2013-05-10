<%@page contentType="text/html;charset=gbk"%>
<html >
	<head>
	 <link rel="stylesheet" type="text/css" href="css/style.css"/>
	</head>
	<body>
<div id="header">
			<ul>
				<li><a href="student!quit.action" target="_parent">退出</a></li>
				<li><a href="http://www.baidu.com">帮助中心</a></li>
				<li><a href="http://localhost:8088/blog/login.php">意见反馈</a></li>
				<li><a href="http://localhost:8080/j2ee/manager/login.jsp">联系管理员</a></li>
			</ul>
			<p>上海电力学院</p>
			<p><font face="楷体" color="green">用户：${stu_no} 密码:${stu_pass}</font> 已经登录</p>
		</div>


	</body>
</html>

