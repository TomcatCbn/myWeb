package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 主要处理首页
 * @author boning
 *
 */
@Controller
public class HomeController {
	/**
	 *处理首页的Url访问 
	 */
@RequestMapping({"/","/home"})	
public String home(){
	return "home";
}
}
