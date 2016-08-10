package com.game.dao;

import java.util.List;

import com.game.model.Product;


public interface ProductDAO {
public List<Product> list();
	
	public Product get(int id);
	
	public void saveOrUpdate(Product product);
	public void delete(int id);

	//public boolean isValidCredentials(String user, Boolean isAdmin, String pass);

	public Product getProductByName(String name);
	


}
