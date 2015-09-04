package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 主要处理首页
 * @author boning
 *
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.myweb.po.User;
@Controller
public class HomeController {
	/**
	 *处理首页的Url访问 
	 */
@RequestMapping({"/","/home"})	
public String home(){
	return "home";
}

@RequestMapping("/home/display")
public @ResponseBody User displayUser(Model model){
	User user = new User();
			user.setHobby("Running");
	user.setSex("man");
	user.setUsername("cbn");
	model.addAttribute(user);
	System.out.println(user);
	return user;
	
}
}
