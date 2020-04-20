<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <head>
  <meta charset="utf-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
  <link href="add.css"type="text/css" rel="stylesheet"/>
 </head>
 <body>
 
  <h1 style="text-align:center">商品介绍</h1>
<ul>
	<td><a href="index.jsp">首页</a></td>
	<td><a href="#">|</a></td>
	<td><a href="div-review.jsp">商品介绍</a></td>
	<td><a href="#">|</a></td>
	<td><a href="reg.jsp">注册</a></td>
	<td><a href="#">|</a></td>
	<td><a href="login.jsp">登录</a></td>
</ul>
  <div class="main">
		<%
			for(int i=1;i<7;i++)
			{
		%>
		<div style="float:left;margin-right:10px">
			<img src="images/<%=i %>.jpg" width="310" height="220"/>
		</div>
		<%
		}
		%>
  </div>
 </body>
</html>
