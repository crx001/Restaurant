package com.restaurant.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.restaurant.mapper.UserorderMapper;

@Controller
public class OrderList {

	@Resource
	private UserorderMapper userordermapper;
/**
 * 查询用户订单 
 * @param session
 * @param page
 * @return
 */
	@PostMapping("/select_orderlist")
	@ResponseBody
	public PageInfo selectUserOrder(HttpSession session,@RequestParam("page")int page) {
	String uname=	(String) session.getAttribute("uname");
	PageHelper.startPage(page, 8);
        List user_orderlist= userordermapper.selectUserMeun(uname);
        PageInfo pageinfo=new PageInfo(user_orderlist);
		return pageinfo;
	}

}
