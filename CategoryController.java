package com.game.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.game.model.Category;

import com.game.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService cs;
	
	@RequestMapping("/AddCategory")
	public ModelAndView displaycatpage()
	{
		ModelAndView mv=new ModelAndView("AddCategory");
		System.out.println("catgy page is from catcontroller");
		return mv;
	}
	
	
	@RequestMapping("/addcategory")
	public ModelAndView addcategory(
			@ModelAttribute Category category,
			@RequestParam(value = "cname") String name,
			@RequestParam(value = "cdescription") String desc
			 ) {
		
		category.setCname(name);
		category.setCdescription(desc);



		System.out.println("in category controller");
		cs.saveOrUpdate(category);
		ModelAndView mv = new ModelAndView("Adminpage");
		return mv;
	}
	
}
