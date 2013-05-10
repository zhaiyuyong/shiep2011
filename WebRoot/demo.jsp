<%@ page language="java" import="" charset="gbk" pageEncoding="utf-8"%>
<%@ page import="java.util.*, java.sql.*" %>
<%

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/j2ee", "root", "610703");

String sqlQuery = "select * from user ";
PreparedStatement psQuery = conn.prepareStatement(sqlQuery);

ResultSet rs = psQuery.executeQuery();
//rs.next();
 while(rs.next()){
	 out.println(rs.getString(3));
	 
 }


%>

