<%--
网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2014, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%
Class.forName("com.mysql.jdbc.Driver");
String urlString="jdbc:mysql://localhost:3306/flight";
String user="abc";
String password="123456";
Connection conn=DriverManager.getConnection(urlString,user,password);
String sql="select * from user_info where username=? and userpwd=?";;
String name = request.getParameter("name");
String pass = request.getParameter("pass");
System.out.println("name:"+name+"pass:"+pass);
PreparedStatement pst=conn.prepareStatement(sql);
pst.setString(1,name);
pst.setString(2,pass);
ResultSet rs=pst.executeQuery();
rs.first();
if(rs.getRow()>0){
out.println("恭喜您，登录成功！");
}
else
{
	out.println("对不起，用户名、密码不符合！");
} 
%>

