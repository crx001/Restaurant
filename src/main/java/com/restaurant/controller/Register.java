package com.restaurant.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restaurant.mapper.UserMapper;
import com.restaurant.model.User;

@Controller
public class Register {
@Resource 
private UserMapper usermapper;

@PostMapping(value="/register" )
@ResponseBody
public String UserRegister(@RequestParam("uname")String uname,@RequestParam("upwd")String upwd){
List<User>	list =usermapper.selectUserInfo(new User(null,uname,upwd,null,null));
if(list.isEmpty()){
	     int i=usermapper.insertSelective(new User(null,uname,upwd,0,0.0));
	     if(i==1){
	    	 return "true";
	     }else{
	    	return "false" ;
	     }	   
}else{
	return "exists";
}

}
}
