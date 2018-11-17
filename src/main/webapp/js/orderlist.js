$(function(){
	to_page(1)
})

/**
 * 翻页查询
 */
function to_page(page){
	$.ajax(
	{
	url: "select_orderlist",
	type:"POST",
	data:{
		page:page
	},
	success:function(data,status){
		if(status=="success"){
			bulid_orderlist_table(data);
			bulid_page_nav(data);
		}
	},
	error:function(){
		alert("查询订单发生错误了")
	}
	}
	)
}

/**
 * 动态建用户订单表
 */
function bulid_orderlist_table(data){
	$("#orderlist_table").empty();
	 var orderlist=data.list
	   $.each(orderlist, function(i, elt) {
		   var order_font_4=$("<span></span>").addClass("order_font_4").append(i+1);
			var order_font_5=$("<span></span>").addClass("order_font_5").append(elt.oname);
			var order_font_5_01=$("<span></span>").addClass("order_font_5").append("货到付款");
			var order_font_5_02=$("<span></span>").addClass("order_font_5").append(elt.onum*elt.oprice);
			var order_font_5_03=$("<span></span>").addClass("order_font_5").append("已发货");
			var order_font_5_04=$("<span></span>").addClass("order_font_5").append("饿了么");
			var order_font_6=$("<span></span>").addClass("order_font_6").append("可以送到");
			var order_font_6_01=$("<span></span>").addClass("order_font_6").append(elt.odate);
			var a=$("<a></a>").addClass("order_font_5").append("查看").attr("style", "cursor:hand");
			var order_font_6_05=$("<span></span>").addClass("order_font_5").append(a);
			var check=$("<div></div>").addClass("order_content_detil").attr("id", i);
			
			order_font_6_05.click(function() {
				var packup=$("<a></a>").append("收起").attr("style", "cursor:hand");
				var pack_up=$("<span></span>").addClass("order_font_5").append(packup);
				pack_up.click(function() {
					$("#"+i).empty();
				})
				 check.append(check_orderlist_head(i)).append(bulid_check_orderlist(elt,i)).append(pack_up);
			})
			$("<div></div>").addClass("order_content_li")
			.append(order_font_4)
			.append(order_font_5)
			.append(order_font_5_01)
			.append(order_font_5_02)
			.append(order_font_5_03)
			.append(order_font_5_04)
			.append(order_font_6)
			.append(order_font_6_01)
			.append(order_font_6_05)
			.append(check)
			.appendTo("#orderlist_table");
			
	   })
	
}

/**
 * 动态建用户订单分页导航
 */
function bulid_page_nav(data){
	$("#page_nav").empty();
   var ul=$("<ul></ul>").addClass("pagination");
   var firstpage=$("<li></li>").append($("<a></a>").append("首页").attr("style", "cursor:hand"))
    var prepage=$("<li></li>").append($("<a></a>").append("上一页").attr("style", "cursor:hand"))
    if(data.hasPreviousPage==false){
 	   firstpage.addClass("disabled");
 	  prepage.addClass("disabled");
    }
   ul.append(firstpage).append(prepage)
   $.each(data.navigatepageNums, function(i, elt) {
   	var numli=$("<li></li>").append($("<a></a>").append(elt).attr("style", "cursor:hand"))
   	if(data.pageNum==elt){
   		numli.addClass("active")
   	}
   	numli.click(function() {
   		to_page(elt)
   	})
               ul.append(numli);
   })
   

   var nextpage=$("<li></li>").append($("<a></a>").append("下一页").attr("style", "cursor:hand"))
   var lastpage=$("<li></li>").append($("<a></a>").append("尾页").attr("style", "cursor:hand"))
   if(data.hasNextPage==false){
	   nextpage.addClass("disabled");
	   lastpage.addClass("disabled");
   }
   
   firstpage.click(function() {
   	to_page(1)
   })
   prepage.click(function() {
   	to_page(data.pageNum-1)
   })
    nextpage.click(function() {
   	to_page(data.pageNum+1)
   })
    lastpage.click(function() {
   	to_page(data.pages)
   })
   ul.append(nextpage).append(lastpage)
  ul.appendTo("#page_nav")
	
	
}

/**
 * 查看商品表头
 */
function check_orderlist_head(i){
	$("#"+i).empty();
	var id=$("<span></span>").append("序号").addClass("order_font_11");
	var img=$("<span></span>").append("商品图片").addClass("order_font_13");
	var name=$("<span></span>").append("商品名称").addClass("order_font_12");
	var price=$("<span></span>").append("单价").addClass("order_font_13");
	var num=$("<span></span>").append("数量").addClass("order_font_13");
	var allprice=$("<span></span>").append("小计").addClass("order_font_13");
	$("<div></div>")
	.append(id)
	.append(img)
	.append(name)
	.append(price)
	.append(num)
	.append(allprice)
	.appendTo("#"+i)
	.attr("id", i);
}

/**
 * 查看商品内容
 */
function bulid_check_orderlist(data,i){
	var order_font_14=$("<span></span>").addClass("order_font_14").append(i+1);
	var image=$("<img></img>").attr("src", "image/pro_image.gif");
	var order_font_17=$("<span></span>").addClass("order_font_17").append(image);
	var order_font_15=$("<span></span>").addClass("order_font_15").append(data.ofood);
	var order_font_16=$("<span></span>").addClass("order_font_16").append(data.oprice);
	var order_font_16_01=$("<span></span>").addClass("order_font_16").append(data.onum);
	var order_font_16_02=$("<span></span>").addClass("order_font_16").append(data.onum*data.oprice);
	$("<div></div>")
	.append(order_font_14)
	.append( order_font_17)
	.append(order_font_15)
	.append(order_font_16)
	.append(order_font_16_01)
	.append(order_font_16_02)
	.appendTo("#"+i)
	.addClass("order_content_li2")
}

