package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.game.model.User;
import com.game.service.UserService;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView Welcome()
	{
		ModelAndView mv=new ModelAndView("Welcome");
		return mv;
	}
	
	@Autowired
	private UserService userService;
	User user;
	
	@RequestMapping("/UserRegistration")
	public ModelAndView displayHomePage(@ModelAttribute("user")User user){
		System.out.print("\nMyController - displayHomePage as landpage()");
		ModelAndView mv = new ModelAndView("UserRegistration");		
		return mv;
	}

		@RequestMapping(value="/userregistration",method=RequestMethod.POST)
		public ModelAndView register(@ModelAttribute("user") User user,BindingResult bindingResult)
	    {	
			if(bindingResult.hasErrors())
			{
				return new ModelAndView("UserRegistration");
			}
			System.out.println("in register controller");
			userService.saveOrUpdate(user);
			ModelAndView mv = new ModelAndView("Login");
			return mv;
		
		
}
}
