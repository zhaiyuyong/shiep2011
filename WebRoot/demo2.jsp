<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*, java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  <meta http-equiv="Content-Type" content="text/html; charset=gbk">-->
<title>Insert title here</title>
</head>
<body>
<%
//
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/j2ee?user=root&password=610703");

String sqlQuery = "select * from messge where content='哈哈哈'";
PreparedStatement psQuery = conn.prepareStatement(sqlQuery);

ResultSet rs = psQuery.executeQuery();
//rs.next();
 while(rs.next()){
	 out.println(rs.getString(4));
	 
 }
 
 String sql = "insert into messge values (null, ?, ?,?,?)";
 PreparedStatement ps = conn.prepareStatement(sql);
 ps.setInt(1, 1);
 ps.setInt(2, 2);
 ps.setString(3, "联通");
 ps.setString(4, "2012-05-20");
 ps.executeUpdate();
 ps.close();
 conn.close();


%>
<a href="">翟玉勇</a>
</body>
</html>