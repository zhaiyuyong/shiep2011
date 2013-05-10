<%@ page language="java"  pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>

		<form action="uploadAction.action" method="post" enctype="multipart/form-data">
		username:<input type="text" name="username"><br>
		file:<input type="file" name="file"><br>
		file2:<input type="file" name="file"><br>
		file3:<input type="file" name="file"><br>
		<input type="submit" value="submit">
		</form>
</body>
</html>