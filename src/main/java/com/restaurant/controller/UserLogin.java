package com.restaurant.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.restaurant.mapper.UserMapper;
import com.restaurant.model.User;

@Controller
public class UserLogin {

	@Resource
	private UserMapper userMapper;

	/**
	 * 
	 * 用户登录
	 * 
	 * @param uname
	 *            用户输入的账号
	 * @param upwd
	 *            用户输入的密码
	 * @param model
	 *            存储返回前台的信息
	 * @param message
	 *            前台信息
	 * @param captcha
	 *            输入验证码
	 * @return
	 */
	@PostMapping(value = "/userlogin", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String isNull(@RequestParam(value = "uname") String uname, @RequestParam(value = "upwd") String upwd,
			@RequestParam(value = "captcha") String captcha, HttpSession session) {
		String token = (String) session.getAttribute("rand");
		System.out.println("账号名:" + uname + "and" + upwd + "验证码:" + token);
		//保存用户账户在session域中
		session.setAttribute("uname", uname);
		if (!captcha.equals(token)) {
			return "验证码错误";
		}
		List<User> dataUser = userMapper.selectUserInfo(new User(null, uname, upwd, null, null));
		if (dataUser.isEmpty()) {
			return "用户不存在或密码错误";
		}
		return "index";
	}
}
