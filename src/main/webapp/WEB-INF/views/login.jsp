<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登陆界面</title>
    
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="image/style.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
  </head>
  <script type="text/javascript" src="js/login.js"></script>
  <body onkeydown="enterlogin()">
<div id="manage_body">

<!-- header -->
<div id="manage_header_wrapper">
<div id="manage_header_top">
<div id="header_top_left">
</div>
<div id="header_top_content">
<div id="header_top_slogan">
网上购物店
</div>
<div id="header_right_logo"><img src="image/tel_image.gif" /></div>
<div id="header_top_teltim">
<div id="header_top_tel">电话：<span class="font3">0757-8800000</span></div>
<div id="header_top_tel">手机：<span class="font3">10000000000</span></div>
<div id="header_top_tim">
营业时间：周一至周日 8：00-24：00</div>
<div id="header_top_tim">
店铺地址：广东省广州市中山大学XXXXX街道</div>
</div>
</div>

<div id="header_top_right">
</div>
</div>
<div id="manage_header_foot">

<div id="manage_header_search">

</div>
<div id="header_foot_menu">
<ul>
	
	  <li><a href="register">会员登录</a></li>


    </ul>
</div>
</div>  
</div>
<!-- end of header -->






<!-- content -->
<div id="manage_content_wrapper" style="height:400px">

 
      
	  <div style="text-align:center; margin:auto; width:300px; height:200px; border:1px solid #FFFF00">
	  <form  action="userlogin"    method="post" id=login>
	      <table align="center"  >
		     <tr>
			     <td>用户名</td>
				 <td><input type="text"  name="uname" id="uname" /></td>
				 <td></td>
			 </tr>
			 <tr>
			     <td>密码</td>
				 <td><input type="password" name="upwd" id="upwd" /></td>
				 <td></td>
			 </tr>
			  <tr>
			     <td>验证码</td>
				 <td><input type="text" name="captcha" id=captcha /></td>
				 <td></td>
			 </tr>
			  <tr>
			     <td>&nbsp;</td>
				 <td colspan="2">
				   <img src="image/vc_image.jsp"   id="img"  alt="看不清楚，换一张"  onclick="change_captcha()"><tr>
			     <td> <input type="button" value="登录"  onclick="login()"/> </td>
				 <td colspan="2">
				   <input type="reset" value="清空"/>
				 </td>
			 </tr>
		  </table>
		  <a href="index" id="gotoIndex"></a>
		      <div id="message"></div>
	       </form>
	       <a></a>
	  </div>
   



</div>
<!-- end of content -->

<!-- footer -->
<div id="manage_footer_wrapper">

备案号：信息

</div> 
<!-- end of footer -->
</div>
</body>
</html>
