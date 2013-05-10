<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
	<script type="text/javascript" src="js/jquery.js"></script>
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
    <style type="text/css">
        th{
            background:#0066FF;
            color:#FFFFFF;
            line-height:20px;
            height:30px;
        }
        td {
            padding:6px 11px;
            border-bottom:1px solid #95bce2;
            vertical-align:top;
            text-align:center;
        }
        td * {
        padding:6px 11px;
        }
        tr.alt td {
        background:#ecf6fc; /*这行将给所有的tr 加上背景色*/
        }
        tr.over td {
        background:#bcd4ec; /*这个将是鼠标高亮行的背景色*/
        }
        a{
        	text-decoration: none;
        }
    </style>
	</head>
	<body>
	<s:debug></s:debug>
		<center>
			<table border="0" class="stripe" cellspacing="0"cellpadding="0">
				<tr>
					<th bgcolor="fuchsia">ID</th>
					<th bgcolor="fuchsia">学号</th>
					<th bgcolor="fuchsia">姓名</th>
					<th bgcolor="fuchsia">性别</th>
					<th bgcolor="fuchsia">密码</th>
					<th bgcolor="fuchsia">email</th>
					<th bgcolor="fuchsia">学院</th>
					<th bgcolor="fuchsia">班级</th>
					<th bgcolor="fuchsia">生日</th>
					<th bgcolor="fuchsia">地址</th>
					<th bgcolor="fuchsia">删除</th>
					<th bgcolor="fuchsia">查看</th>
					<th bgcolor="fuchsia">发信息</th>
				</tr>
				<s:iterator value="all">
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="stuNo"/></td>
						<td class="no1"><s:property value="stuName"/></td>
						<td><s:property value="sex"/></td>
						<td><s:property value="password"/></td>
						<td><s:property value="email"/></td>
						<td><s:property value="dept"/></td>
						<td><s:property value="classNo"/></td>
						<td><s:property value="birth"/></td>
						<td><s:property value="address"/></td>
						<td><a href="studentAction!delete.action?stuId=<s:property value="id"/>">删除</a></td>
						<td><a href="studentAction!toupdate.action?stuId=<s:property value="id"/>">查看</a></td>
						<td><a href="csstextMail.jsp?stuemail=<s:property value="email"/>">发送邮件</a></td>
					</tr>
    			</s:iterator>
    
			</table>
		</center>
	</body>
</html>