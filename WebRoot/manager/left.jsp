<%@ page language="java"  pageEncoding="gbk"%>

<html>
<head>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/chili-1.7.pack.js"></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.dimensions.js"></script>
<script type="text/javascript" src="js/jquery.accordion.js"></script>

<script language="javascript">
	jQuery().ready(function(){
		jQuery('#navigation').accordion({
			header: '.head',
			navigation1: true, 
			event: 'click',
			fillSpace: true,
			animated: 'bounceslide'
		});
	});
</script>
<style type="text/css">
<!--
body {
	margin:0px;
	padding:0px;
	font-size: 12px;
	background-color: gray;
}
#navigation {
	margin:0px;
	padding:0px;
	width:147px;
}
#navigation a.head {
	cursor:pointer;
	background:url(images/main_34.gif) no-repeat scroll;
	display:block;
	font-weight:bold;
	margin:0px;
	padding:5px 0 5px;
	text-align:center;
	font-size:12px;
	text-decoration:none;
}
#navigation ul {
	border-width:0px;
	margin:0px;
	padding:0px;
	text-indent:0px;
}
#navigation li {
	list-style:none; display:inline;
}
#navigation li li a {
	display:block;
	font-size:12px;
	text-decoration: none;
	text-align:center;
	padding:3px;
}
#navigation li li a:hover {
	background:url(images/tab_bg.gif) repeat-x;
		border:solid 1px #adb9c2;
}
-->
</style>

</head>
<body>

<%request.setCharacterEncoding("gbk"); %>
<div  style="height:100%;">
  <ul id="navigation">
    <li> <a class="head">ѧ����Ϣ����</a>
      <ul>
        <li><a href="studentAction!list.action" target="rightFrame">����ѧ��</a></li>
         <li><a href="addStudent.jsp" target="rightFrame">���ѧ��</a></li>
       	 <li><a href="csstextMail.jsp" target="rightFrame">�����ʼ�</a></li> 
      </ul>
    </li>
    <li> <a class="head">ѧ�����Ϣ</a>
      <ul>
        <li><a href="informationAction!list.action" target="rightFrame">������Ϣ</a></li>
        <li><a href="addInformation.jsp" target="rightFrame">����������Ϣ</a></li>
        <li><a href="addStudentInformation.jsp" target="rightFrame">����ѧ����Ϣ</a></li>
      </ul>
    </li>
    <li> <a class="head">��̳������Ϣ</a>
      <ul>
        <li><a href="messageAction!old.action" target="rightFrame">�Ѿ��ظ�����</a></li>
        <li><a href="messageAction!xin.action" target="rightFrame">������</a></li>
      </ul>
    </li>
   
    <li> <a class="head">�汾��Ϣ</a>
      <ul>
        <li><a href="right.jsp" target="rightFrame">V1.0 ������20091722<br>2012��4��19��</a></li>
      </ul>
    </li>
  </ul>
</div>
</body>
</html>
