$(function() {

	to_page(1,"pageMeun")
})

/**
 * 动态生成table
 */
function bulid_meun_table(data) {
	$("#meun_table").empty();
	var meun = data.list;
	$.each(meun, function(i, elt) {
		var img = $("<img></img>").attr("src", "image/pro_image.gif").attr("border", "0");
		var product_image = $("<div></div>").append(img).addClass("product_image");
		var fname = $("<a></a>").append(elt.fname);
		var product_title = $("<div></div>").append(fname).addClass("product_title");
		var product_sale4 = $("<div></div>").append("市场价：￥" + elt.fprice).addClass("product_sale4");
		var msg = $("<div></div>").attr("id", elt.fid);
		var car = $("<input></input>").attr("value", "放购物车").attr("type", "button");
		var product_car = $("<div></div>").append(car).append(msg).addClass("product_car");
		//添加购物车
		product_car.click(function() {
			addfood(elt);
		})
		$("<div></div>")
			.append(product_image)
			.append(product_title)
			.append(product_sale4)
			.append(product_car)
			.addClass("left_product1")
			.prependTo("#meun_table");

	})
}


/**
 * 动态生成分页导航
 */
function bulid_page_nav(data,url) {
	$("#leftpro_page").empty();
	var leftpro_page_01 = $("<div></div>").attr("id", "leftpro_page_1");
	var leftpro_page_03 = $("<div></div>").attr("id", "leftpro_page_3");
	var btn2 = $("<input></input>").attr("type", "button").attr("value", "查看已点菜单");
	var leftpro_page_2 = $("<div></div>").append(btn2).attr("id", "leftpro_page_2");
	var btn1 = $("<input></input>").attr("type", "button");
	var btn3 = $("<input></input>").attr("type", "button");
	var leftpro_page_1 = $("<div></div>").append(btn1).attr("id", "leftpro_page_1");
	var leftpro_page_3 = $("<div></div>").append(btn3).attr("id", "leftpro_page_3");
	/**
	 * 上一页翻页
	 */
	leftpro_page_1.click(function() {
		to_page(data.pageNum - 1,url);
	})
	/**
	 * 下一页翻页
	 */
	leftpro_page_3.click(function() {
		to_page(data.pageNum + 1,url);
	})
	/**
	 * 查看已点菜单
	 */
	leftpro_page_2.click(function() {
		var uname=$("#uname").val();
		if(uname.length==0){
			alert("请先登陆账号哦")
		}
		document.getElementById("gotoOrderList").click();
	})
	if (data.pageNum == 1) {
		$("<div></div>").append(leftpro_page_2).append(leftpro_page_01).append(leftpro_page_3).prependTo("#leftpro_page");
	} else if (data.pageNum == data.pages) {
		$("<div></div>").append(leftpro_page_2).append(leftpro_page_1).append(leftpro_page_03).prependTo("#leftpro_page");
	} else {
		$("<div></div>").append(leftpro_page_2).append(leftpro_page_1).append(leftpro_page_3).prependTo("#leftpro_page");
	}
}

/**
 * 翻页
 */
function to_page(page,url) {
	$.ajax({
		url : url,
		type : "POST",
		data : {
			page : page
		},
		success : function(data, status) {
			if (status == "success") {
				bulid_meun_table(data);
				bulid_page_nav(data,url);
			} else {
				alert("菜单错误")
			}
		},
	})

}


/**
 * 添加购物车
 */
function addfood(food) {
	if (food.fid != null) {
		$.ajax({
			url : "addFood",
			type : "POST",
			data : {
				foodList : JSON.stringify(food)
			},
			traditional : true,
			success : function(data) {
				if (data == "true") {
					var f = food.fid;
					$("#" + f).html("添加成功")
					setTimeout(function() {
						$("#" + f).html(null)
					}, 500)
				} else {
					alert("您还没有登陆哦")
				}
			},
			error : function() {
				alert("添加购物车出错啦")
			}
		})
	}
}

/**
 * 搜索食物
 */
function select_fname() {
	var select_fname = $("#select_fname").val();
	if (select_fname.length != 0) {
		$.ajax({
            url:"select_fname",
            data:{
            	select_fname:select_fname
            },
            type:"POST",
            success:function(data,status){
            	if(status="success"){
            		bulid_meun_table(data,"select_fname")
            	}
            },
            error:function(){
            	alert("搜索发生错误啦")
            }
		})
	}
}