package com.game.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

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
	
	@RequestMapping("/Welcome")
	public ModelAndView uWelcome()
	{
		ModelAndView mv=new ModelAndView("Welcome");
		return mv;
	}
	
	@RequestMapping("/angularjs")
	public ModelAndView angular()
	{
		ModelAndView mv=new ModelAndView("angularjs");
		return mv;
	}
	@RequestMapping("/uangularjs")
	public ModelAndView uangular()
	{
		ModelAndView mv=new ModelAndView("uangularjs");
		return mv;
	}
	
	
	@RequestMapping("/Login")
	public ModelAndView login()
	{
		ModelAndView mv=new ModelAndView("Login");
		return mv;
	}
	@RequestMapping("/Logout")
	public ModelAndView logot()
	{
		ModelAndView mv=new ModelAndView("Logout");
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

	@RequestMapping(value = "/userregistration", method = RequestMethod.POST)
	public ModelAndView register(@Valid@ModelAttribute("user") User user,BindingResult bindingResult) {

		if(bindingResult.hasErrors())
		{
			return new ModelAndView("UserRegistration");
		}
		System.out.println("in register controller");
		
		System.out.println("in signup controller called successfully");
		userService.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
		
		
		@RequestMapping("UserCheck")
		public ModelAndView usercheck(Principal principal){
			System.out.println("it is of user check");
			return new ModelAndView("Welcome");
			
		}
		
		@RequestMapping("/AdminCheck")
		public ModelAndView admincheck(Principal principal){
			System.out.println("it is of admincheck");
			return new ModelAndView("Adminpage");
		}
		/*@RequestMapping("/logout")
		public ModelAndView logout(Principal principal,HttpSession session){
			session.invalidate();
			return new ModelAndView("logout");
		}
		*/
		@RequestMapping("/logout")
		public String logout(HttpServletRequest request){
			request.getSession().invalidate();
			System.out.println("logout page called");
			return "Logout";
		}
		
}
