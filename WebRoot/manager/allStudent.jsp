<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
	<script type="text/javascript" src="js/jquery.js"></script>
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
        background:#ecf6fc; /*���н������е�tr ���ϱ���ɫ*/
        }
        tr.over td {
        background:#bcd4ec; /*��������������еı���ɫ*/
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
					<th bgcolor="fuchsia">ѧ��</th>
					<th bgcolor="fuchsia">����</th>
					<th bgcolor="fuchsia">�Ա�</th>
					<th bgcolor="fuchsia">����</th>
					<th bgcolor="fuchsia">email</th>
					<th bgcolor="fuchsia">ѧԺ</th>
					<th bgcolor="fuchsia">�༶</th>
					<th bgcolor="fuchsia">����</th>
					<th bgcolor="fuchsia">��ַ</th>
					<th bgcolor="fuchsia">ɾ��</th>
					<th bgcolor="fuchsia">�鿴</th>
					<th bgcolor="fuchsia">����Ϣ</th>
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
						<td><a href="studentAction!delete.action?stuId=<s:property value="id"/>">ɾ��</a></td>
						<td><a href="studentAction!toupdate.action?stuId=<s:property value="id"/>">�鿴</a></td>
						<td><a href="csstextMail.jsp?stuemail=<s:property value="email"/>">�����ʼ�</a></td>
					</tr>
    			</s:iterator>
    
			</table>
		</center>
	</body>
</html>