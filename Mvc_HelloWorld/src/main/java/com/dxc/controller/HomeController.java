package com.dxc.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String home(Model model) {
		model.addAttribute("MyName","Rakesh Srivastaw");
		return "home";
	}
	
	@RequestMapping(value="/users" )
	public String user(Model model) {
		model.addAttribute("userName", "Akash");
		return "user";
	}
}
