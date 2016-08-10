package com.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dao.ProductDAO;
import com.game.model.Product;


@Service
public class ProductService {
	@Autowired
	ProductDAO productDAO;
	
	
	/*
	 * public boolean isValidCredentials(String user,Boolean isAdmin,  String pass)
	 {
		 return productDAO.isValidCredentials(user,isAdmin, pass);
		 
		 
	 }
	 */

	public void saveOrUpdate(Product product)
	{
		productDAO.saveOrUpdate(product);	
	}
	public List<Product> list()
	{
		List<Product> list=productDAO.list();
		return list;
	}
	public Product get(int id)
	{
		return productDAO.get(id);
	}
	public Product getProductByName(String name)
	{
		return productDAO.getProductByName(name);
	}
	public void delete(int id)
	{
		productDAO.delete(id);
	}


}
