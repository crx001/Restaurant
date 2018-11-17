/**
 * 注册
 */
function register() {
	var uname = $("#uname").val();
	var upwd = $("#upwd").val();
	var upwd_2 = $("#upwd_2").val();
	var regular = /^[a-z0-9]{3,16}$/;
	if (uname.length == 0 && upwd.length == 0) {
		$("#message").html("账号或密码不能为空");
	} else {
		if (regular.test(uname) && regular.test(upwd)) {
			if (upwd == upwd_2) {



				$.ajax({
					url : "register",
					type : "POST",
					data : $("#register").serialize(),
					dataType : "TEXT",
					success : function(data, status) {
						if (status == "success") {
							if (data == "true") {
								skipJsp();
							} else {
								if (data == "false") {
									$("#message").html("注册失败");
								} else if (data == "exists") {
									$("#message").html("账号已存在");
								}
							}
						}

					},
					error : function(data) {

						alert("注册出错啦")
					}
				})

			} else {
				$("#message").html("两次输入密码不一致");
			}
		} else {
			$("#message").html("账号或密码格式不正确");
		}
	}
}

/**
 * 跳转页面
 */
function skipJsp() {
	alert("index");
	document.getElementById("gotoIndex").click();
}

/**
 * 回车登陆
 */
function enter() {
	if (event.keyCode == 13) {
		register();
	}


}