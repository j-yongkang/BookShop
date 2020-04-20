<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String s="vip用户姜";
int add(int x,int y){
	return x+y;
}
%>
欢迎:<%=s %><br/>
x+y=<%=add(3,5) %><br/>
<%=5+6 %><br/>
<%="5+6" %>
</body>
</html>