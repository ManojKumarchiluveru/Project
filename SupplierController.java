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
			@RequestParam(value = "supname") String name,
			@RequestParam(value = "supmobile") String mobile,
			@RequestParam(value = "supaddress") String address
			 ) {
		
		supplier.setSupname(name);
		supplier.setSupmobile(mobile);
		supplier.setSupaddress(address);



		System.out.println("in supplier controller");
		ss.saveOrUpdate(supplier);
		ModelAndView mv = new ModelAndView("Adminpage");
		return mv;
	}

}