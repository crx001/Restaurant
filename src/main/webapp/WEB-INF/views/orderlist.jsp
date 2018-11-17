<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>${uname}的订单</title>
      <meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="image/style.css">
	
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <script type="text/javascript" src="js/orderlist.js"></script>
  
 <body>
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
</div>  
</div>
<!-- end of header -->





<!-- content -->
<div id="manage_content_wrapper">
<div id="manage_content_left">
<div id="manage_content_promenu">

<div id="content_promenu_content">
<div class="promenu_content_colum1">
<a href="#">烤炸</a>
</div>
<div class="promenu_content_colum1">
<a href="#">小炒</a>
</div>
<div class="promenu_content_colum1">
<a href="#">粉面</a>
</div>
<div class="promenu_content_colum1">
<a href="#">粥类</a>
</div>
<div class="promenu_content_colum1">
<a href="#">点心</a>
</div>
<div class="promenu_content_colum1">
<a href="#">清蒸</a>
</div>
</div>
</div>
</div>
<div id="manage_content_right">


<div id="manage_order_content">
<div id="order_content_top">
<span class="order_font_1">序号</span>
<span class="order_font_2">收货人</span>
<span class="order_font_2">付款方式</span>
<span class="order_font_2">总金额</span>
<span class="order_font_2">订单状态</span>
<span class="order_font_2">送货方式</span>
<span class="order_font_3">店家信息返馈</span>
<span class="order_font_3">购买日期</span>
<span class="order_font_2">相关操作</span>
</div>

<table id="orderlist_table">
</table>



<!-- page -->
<nav aria-label="Page navigation" id="page_nav">

</nav>
<!-- end of page -->

</div>

</div>
</div>
<!-- end of content -->

<!-- footer -->
<div id="manage_footer_wrapper">

</div> 
<!-- end of footer -->
</div>
</body>
</html>