/**
 * 验证账号格式
 * 
 */
//账号失去焦点时
$(document).ready(function() {
	$("#uname").blur(function() {
		var uname = $("#uname").val();
		var regular = /^[a-z0-9]{3,16}$/;
		if (uname.length != 0 && regular.test(uname)) {
			$("#message").html(null);
		} else {
			$("#message").html("账号格式不正确");
		}
	})
})
//账号或密码或验证码聚焦时
$(function() {
	$("#upwd").focusin(function() {
		$("#message").html(null);
	})
	$("#uname").focusin(function() {
		$("#message").html(null);
	})
	$("#captcha").focusin(function() {
		$("#message").html(null);
	})
})

//密码失去焦点时
$(document).ready(function() {
	$("#upwd").blur(function() {
		var upwd = $("#upwd").val();
		var regular = /^[a-z0-9]{3,16}$/;
		if (uname.length != 0 && regular.test(upwd)) {
			$("#message").html(null);
		} else {
			$("#message").html("密码格式不正确");
		}
	})
})

/**
 * 账号登陆
 */


function login() {	
	var uname = $("#uname").val();
	var upwd = $("#upwd").val();
	var captcha=$("#captcha").val();
	var regular = /^[a-z0-9]{3,16}$/;
	if (uname.length != 0 && upwd.length != 0) {
		if (regular.test(upwd) && regular.test(uname)) {
			if(captcha.length==0){
				$("#message").html("验证码不能为空");
			}else{
			$.ajax({
				url : "userlogin",
				type : "POST",
				data : $("#login").serialize(),
				cacha : false,
				dataType:"Text",
				  success:function(data,status){
				  	if(status=="success"){
				  		if(data=="index"){
				  			skipJsp(); 		  			
				  		}else{
             		  		$("#message").html(data)
             		  		change_captcha();
				  		}
				  	}
				  }

			})
			}
		} else {
			$("#message").html("账号或密码格式不正确");
			return false;
		}

	} else {
		$("#message").html("账号或密码不能为空");
		return false;
	}
}


/**
 * <a>标签自动跳转页面
 */
function skipJsp(){
	document.getElementById("gotoIndex").click();
}

/**
 * 回车登陆
 */
function enterlogin(){
	if(event.keyCode==13){
		login();
	}
}
/**
 * 更换验证码
 */
function change_captcha(){
	document.getElementById("img").src="image/vc_image.jsp?"+new Date().getTime();
}
