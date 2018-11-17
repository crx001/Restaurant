package com.restaurant.controller;


import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.restaurant.mapper.FoodMapper;


@Controller
public class JspSkip {
	@Resource	
	private FoodMapper foodMapper;	
	/**
	 * 跳转到注册页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register")
	public String gotoRegister() {
		return "register";
	}

	/**
	 * 跳转到登陆界面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String gotoLogin() {
		return "login";
	}

	/**
	 * 跳转到主页面并打印菜单
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public String gotoIndex() {
		return "index";

	}
	
	@GetMapping("/orderlist")
	public String gotoOrderList(){
		return "orderlist";
	}
}
