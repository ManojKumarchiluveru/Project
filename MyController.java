package com.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView aaa()
	{
		ModelAndView mv= new ModelAndView("Welcome");
		return mv;
	}
	
	@RequestMapping("/Login")
	public ModelAndView bbb()
	{
		ModelAndView mv1= new ModelAndView("Login");
		return mv1;
	}
	
	
	
	
}
