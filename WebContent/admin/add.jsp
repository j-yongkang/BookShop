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
<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath }/ProductsServlet?action=add"  method="post">
  &nbsp;
     <table cellSpacing="1" cellPadding="5" width="100%" align="center"
     bgcolor="#eeeeee" style="border:1px solid #8ba7e3" border="0">
     <tr>
     <td class="ta_01" align="center" bgcolor="#afdlf3" colspan="4" height="26">
     <strong><STRONG>添加商品</STRONG> </strong></td>
     </tr>
     <tr>
     <td align="center" bgcolor="#f5fafe" class="ta_01">商品名称</td>
     <td class="ta_01" bgcolor="#ffffff"> <input type="text" name="name" class="bg" />
     <td align="center" bgcolor="#f5fafe" class="ta_01">商品价格</td>
     <td class="ta_01" bgcolor="#ffffff"> <input type="text" name="price" class="bg" />
     </td>
     </tr>
     <tr>
     <td align="center" bgcolor="#f5fafe" class="ta_01">商品数量</td>
     <td class="ta_01" bgcolor="#ffffff"> <input type="text" name="pnum" class="bg" />
     </td>
     <td align="center" bgcolor="#f5fafe" class="ta_01">商品类别</td>
     <td class="ta_01" bgcolor="#ffffff">
       <select name="category" id="category">
           <option value="" selected="selected">--选择商品类别--</option>
           <option value="水果">水果</option>
           <option value="文具">文具</option> 
           <option value="课本">课本</option> 
           <option value="专业">专业</option> 
           <option value="医护">医护</option> 
           <option value="日用品">日用品</option> 
           <option value="海鲜类">海鲜类</option> 
           <option value="饮料类">饮料类</option> 
           <option value="电子产品">电子产品</option> 
         </select>
         </td>
     </tr>
     <tr>
         <td align="center" bgcolor="#f5fafe" class="ta_01">商品图片</td>
         <td class="ta_01" bgcolor="#ffffff" colspan="3"> <input type="text" name="imgurl" size="30" value="" />
         </td>
         </tr>
          <tr>
              <td align="center" bgcolor="#f5fafe" class="ta_01">商品描述</td>
               <td class="ta_01" bgcolor="#ffffff" colspan="3" height="10"> <input type="text" name="description" size="100" value="" />
               </td>
               </tr>
         <tr>
         <td align="center" colspan="4" class="sep1"> <img src="/lina..images/2.jpg">
         </td>
         </tr>

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
   			 </table>
</form>

</body>
</html>