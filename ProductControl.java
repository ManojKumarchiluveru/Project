package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.game.controller.util.Util;
import com.game.dao.CategoryDAO;
import com.game.dao.ProductDAO;
import com.game.dao.SupplierDAO;
import com.game.model.Category;
import com.game.model.Product;
import com.game.model.Supplier;

@Controller
public class ProductControl {
	
	@Autowired(required=true)
	private ProductDAO productDAO;

	@Autowired(required = true)
	private CategoryDAO categoryDAO;

	@Autowired(required = true)
	private SupplierDAO supplierDAO;

	/*
	 * @Autowired(required=true)
	 * 
	 * @Qualifier(value="productDAO") public void setProductDAO(ProductDAO ps){
	 * this.productDAO = ps; }
	 */

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList", this.productDAO.list());
		model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "product";
	}

	// For adding and updating product
	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product) {
		Util u = new Util();
		String newId = u.replaceComma(product.getId(),",","");
		product.setId(newId);
		Category category = categoryDAO.getByName(product.getCategory().getName());
		categoryDAO.saveOrUpdate(category);  

		Supplier supplier = supplierDAO.getByName(product.getSupplier().getName());
		supplierDAO.saveOrUpdate(supplier); 		
		
		product.setCategory(category);
		product.setSupplier(supplier);
		
		product.setCategory_id(category.getId());
		product.setSupplier_id(supplier.getId());
		
		productDAO.saveOrUpdate(product);

		return "redirect:/products";

	}

	@RequestMapping("product/remove/{id}")
	public String removeProduct(@PathVariable("id") int id, ModelMap model) throws Exception {

		try {
			productDAO.delete(id);
			model.addAttribute("message", "Successfully Added");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		// redirectAttrs.addFlashAttribute(arg0, arg1)
		return "redirect:/products";
	}

	@RequestMapping("product/edit/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		System.out.println("editProduct");
		model.addAttribute("product", this.productDAO.get(id));
		model.addAttribute("listProducts", this.productDAO.list());
		model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());
	
		return "product";
	}

}
