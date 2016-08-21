package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.game.model.Supplier;
import com.game.service.SupplierService;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierService ss;
	
	@RequestMapping("/AddSupplier")
	public ModelAndView displaysppage()
	{
		ModelAndView mv=new ModelAndView("AddSupplier");
		System.out.println("supplier page is from catcontroller");
		return mv;
	}
	
	@RequestMapping("/addsupplier")
	public ModelAndView suppplier(
			@ModelAttribute Supplier supplier,
			@RequestParam(value = "sname") String name,
			@RequestParam(value = "saddress") String address
			 ) {
		
		supplier.setSname(name);
		supplier.setSaddress(address);



		System.out.println("in supplier controller");
		ss.saveOrUpdate(supplier);
		ModelAndView mv = new ModelAndView("Admin");
		return mv;
	}

}
