<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("username");
String pwd = request.getParameter("password");
String tel = request.getParameter("tel");
String age = request.getParameter("age");
%>
用户名为：<%=name %><br/>
密码为：<%=pwd %><br/>
手机号码为：<%=tel %><br/>
年龄为：<%=age %>
</body>
</html>