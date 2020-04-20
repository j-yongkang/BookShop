<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="textml; charset=utf-8">
<title></title>
<style type="text/css">
#mbtn{
	width: 580px;
	margin: auto;
}
.btn{
	margin:10px auto;
	width: 280px;
}
 </style>
</head>
<body>
<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath }/ProductsServlet?action=findbyid"  method="post">
  &nbsp;
     <table cellSpacing="1" cellPadding="5" width="100%" align="center"
     bgcolor="#eeeeee" style="border:1px solid #8ba7e3" border="0">
     <tr>
     <td class="ta_01" align="center" bgcolor="#afdlf3" colspan="4" height="26">
     <strong><STRONG>根据id查询商品</STRONG> </strong>
     </td>
   	  </tr>
	 
	 <tr>
     <td class="ta_01" align="center" bgcolor="#afdlf3" colspan="4" height="26">
     <strong><STRONG>请输入id号</STRONG> </strong>
	 <input type="text" name="id">
     </td>
     </tr>
			<tr>

			<td class="ta_01" style="WIDTH:100%" align="center"
				bgcolor="#f5fafe" colspan="4">
              	<input type="submit" class="button_ok" value="确定">
              	<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
              	<input type="reset" value="重置" class="button_cancel">
              	<FONT face="宋体">
              		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              	</FONT>
              	<input class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
              	<span id="Labell"></span>
   			</tr>
   		 </table>
</form>

</body>
</html>