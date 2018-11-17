package com.restaurant.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.restaurant.mapper.FoodMapper;
import com.restaurant.mapper.UserorderMapper;
import com.restaurant.model.Food;
import com.restaurant.model.Userorder;

import net.sf.json.JSONObject;

@Controller
public class Meun {
	@Resource
	private FoodMapper foodMapper;
	@Resource
	private UserorderMapper userordermapper;

	/**
	 * 菜单查询
	 * 
	 * @param model
	 * @return
	 */
	@PostMapping(value = "/pageMeun")
	@ResponseBody
	public PageInfo lastMeun(Model model, @RequestParam("page") int page) {
		PageHelper.startPage(page, 8);
		List<Food> allFood = foodMapper.selectAllFood();
		PageInfo pageInfo = new PageInfo(allFood);
		return pageInfo;
	}
/**
 * 添加到购物车
 * @param foodList
 * @param session
 * @return
 */
@PostMapping("/addFood")
@ResponseBody
public String add_Food(@RequestParam("foodList") String foodList ,HttpSession session){
	String uname=(String) session.getAttribute("uname");
	if(uname==null){
		return "false";
	}else{
		  JSONObject food= new JSONObject().fromObject(foodList);
		  String date=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
		  int fid=Integer.parseInt(food.getString("fid"));
		  Double fprice=Double.valueOf(food.getString("fprice"));
		Boolean addUserOrder=userordermapper.addUserOrder(new Userorder(uname,food.getString("fname"),fid,1,fprice,date));
             String msg=String.valueOf(addUserOrder);
		  return msg;
	}
         
         
}

/**
 * 搜索菜单食物
 * @param select_fname
 * @return
 */
@PostMapping("/select_fname")
@ResponseBody
public PageInfo select_meun(@RequestParam("select_fname")String select_fname){
	System.out.println(select_fname);
	               PageHelper.startPage(1, 8);
	       List<Food>list =foodMapper.selectAllFood( select_fname);
	       PageInfo pageInfo = new PageInfo(list);
	       for (Food food : list) {
			System.out.println(food);
		}
	return pageInfo;
}

}
