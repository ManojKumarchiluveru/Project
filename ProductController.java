package com.game.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.game.model.Product;
import com.game.service.ProductService;
import com.google.gson.Gson;

@Controller
public class ProductController {
	
	@RequestMapping("/Adminpage")
	public ModelAndView admin()
	{
		ModelAndView mv=new ModelAndView("Adminpage");
		return mv;
	}
	
	@Autowired
	private ProductService productService; 
	
	@RequestMapping("/AddProduct")
	public ModelAndView displaprdPage(@ModelAttribute("product")Product product){
		System.out.print("\nMyController - displayHomePage as landpage()");
		ModelAndView mv = new ModelAndView("AddProduct");		
		return mv;
	}
	
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product")Product pd,HttpServletRequest request)
	{		
	 	System.out.println("in product controller11");

		@SuppressWarnings("unused")
		String filename;
	 	@SuppressWarnings("unused")
		byte[]bytes;
	 	System.out.println(pd.getPdescription());
	 	
	 	//--------notepadcopy-------------//
	 	
	 		System.out.println("image uploaded");
	 		
	///////////notepad/////////////
	
	
	System.out.println("product controller called");
	MultipartFile image=pd.getImg();
	Path path;
	path= Paths.get("D:/ProfessionalGaming/ProfessionalGaming/src/main/webapp/resources/images/"+pd.getPname() +".jpg");
	
	System.out.println("Path = " + path);
    System.out.println("File name = " + pd.getImg().getOriginalFilename());
    if(image!=null && !image.isEmpty())
    {
    	try
    	{
    	 image.transferTo(new File(path.toString()));
    	  System.out.println("Image Saved in:"+path.toString());
    	}catch(Exception e)
    	{
    e.printStackTrace();
    		System.out.println("Image not saved");
    	}
  }
   
    productService.saveOrUpdate(pd);

    return "angularjs";
	}
	
	@RequestMapping("/viewproductpage")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Product> list = productService.list();
		System.out.println("product list="+list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("viewproductpage","listofitem",listjson);
		
	
	}
	
	
	@RequestMapping("deleteproduct")
	public String deleteProduct(@RequestParam int pid) throws Exception {
		System.out.println("In delete");
		System.out.println(pid);

	    try {
	        productService.delete(pid);
	      //  model.addAttribute("message", "Successfully Added");
	    } catch (Exception e) {
	     //   model.addAttribute("message", e.getMessage());
	        e.printStackTrace();
	    }
	    // redirectAttrs.addFlashAttribute(arg0, arg1)
	    return "angularjs";
	}
	
	
	
	@RequestMapping("/editproduct")
	public ModelAndView editItem(@RequestParam("pid") int pid)
	{
	System.out.println("id:"+pid);
	Product product=productService.get(pid);
	System.out.println("Product Name:"+product.getPname());
	return new ModelAndView("UpdateProduct","product",product);
	}
	
	
	@RequestMapping("/updateproduct")
	public String updateProduct(@RequestParam int pid,@RequestParam("pname") String pname,@RequestParam("pdescription") String pdescription,@RequestParam("pprice") int pprice, @RequestParam("pquantity") int pquantity)
	{
	//int prodId=Integer.parseInt(pid);
   Product product=productService.get(pid);
   product.setPid(pid);
	product.setPname(pname);
	product.setPdescription(pdescription);
	product.setPprice(pprice);
	product.setPquantity(pquantity);
	productService.updateProduct(product);

	        return "redirect:/angularjs";
	        }
	@RequestMapping("edit")
	public ModelAndView editProduct(@RequestParam int pid, @ModelAttribute Product product)
	{
		
		Product prodObject = productService.get(pid);
		return new ModelAndView("product", "prodObject", prodObject);
	}
	
	String setName;
	List<Product> plist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()throws Exception
	{
	String result = "";
	plist = productService.list();
	Gson gson = new Gson();
	result = gson.toJson(plist);
	return result;
	}
	
	
}
	