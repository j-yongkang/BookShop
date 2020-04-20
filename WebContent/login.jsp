<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="utf-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>登录</title>
  <link href="css/formcss.css" rel="stylesheet" />
 </head>
 <body>
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
	<div class="dyl">

		  <form action="LonginServlet" method="post" name="reghtml" >
		 	  <fieldset>
			  <div class="yl">
			  </div>
				  <label for="user"></label>
					   <input type="text" name="username" id="user" placeholder="邮箱" class="user"/>
				 <label for="user"></label>
					   <input type="password" name="password" id="wpd" placeholder="密码" class="user1"/>
				<input type="submit" value="登录" class="sub"/>	
				<input type="submit" value="忘记密码" class="sub"/>	
			</fieldset>
		</form>

</div>
</div>
 </body>
</html>
