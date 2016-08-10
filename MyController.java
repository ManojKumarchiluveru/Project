package com.game.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.game.model.User;
import com.game.service.UserService;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView aaa(){
		ModelAndView mv= new ModelAndView("Welcome");
		return mv;
	}
	
	@RequestMapping("/Login")
	public ModelAndView bbb(){
		ModelAndView mv= new ModelAndView("Login");
		return mv;
	}
	
	@RequestMapping("/Signup")
	public ModelAndView ccc(){
		ModelAndView mv= new ModelAndView("Signup");
		return mv;
	}
	

	@Autowired
	UserService userService;
	User user;
	
	@RequestMapping("/registration")
	public ModelAndView Registercontroller(@ModelAttribute User user,
			@RequestParam(value = "ufirstname") String firstname,
			@RequestParam(value = "ulastname") String lastname,
			@RequestParam(value = "uemail") String email,
			@RequestParam(value = "upassword") String password

			)
	
	{
		


		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setEmail(email);
		user.setPassword(password);
		
		userService.saveOrUpdate(user);

		ModelAndView mv=new ModelAndView("Login");
	System.out.println("Register controller called");
		
		
		return mv;
	}
	
	
	 
	@RequestMapping("/Admin")
	public ModelAndView ddd(){
		ModelAndView mv = new ModelAndView("Admin");
		return mv;
	}

	@RequestMapping("/")
	public ModelAndView ddd(){
		ModelAndView mv = new ModelAndView("Admin");
		return mv;
	} 
	
	
	
	
	
}
