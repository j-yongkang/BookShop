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
  <title>注册页面</title>
  <link href="css/zx.css" rel="stylesheet" />
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
  <form action="RegServlet" method="post" name="f1" >
  <fieldset>
 <h1><center>注册</center></h1>
  <label for="user">用户名:</label>
       <input type="text" name="username" id="user" placeholder="请输入用户名，3-20个字符" />
  <label for="pwd">密码</label>
       <input type="password" name="password" id="pwd" placeholder="请输入密码，3-20个字符" />
  <label for="age">年龄</label>
       <input type="number" name="age" id="age" max="100" min="5" value="20" />
 <label for="email">邮箱</label>
      <input type="number" name="tel" id="tel" class="comm" maxlength="11" minlength="11"/>
<label for="sex">性别</label>
         <input type="text" name="sex" id="sex" list="sexl" />
         <datalist id="sexl">
         <option value="男" />
	     <option value="女" />
	     </datalist>

	 <input type="submit" value="注册" />
	 <input type="reset" value="重置" />
 </fieldset>
  </form>
 </body>
</html>
