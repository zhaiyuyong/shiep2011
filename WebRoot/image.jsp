<%@ page language="java" pageEncoding="gbk"%>
<%@page import="java.io.File"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.BufferedImage"%>
<%
	File dir = new File("D:/apache-tomcat-6.0.35/webapps/JELast/images");

	String[] str = dir.list();
	for(int i=0;i<str.length;i++) {
%>
<img src="images/<%=str[i]%>">
<%

}
%>