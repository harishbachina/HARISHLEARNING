package com.hs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login.htm")
	public String authanticate(String userId,String password){
		ModelMap map=new ModelMap();
		map.addAttribute("count", "count");
		return "sucess";
	}
}
