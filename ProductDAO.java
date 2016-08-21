package com.game.dao;

import java.util.List;

import com.game.model.Product;

public interface ProductDAO {
	
	public void saveOrUpdate(Product product);
	 
	public Product get(int pid);
	public Product getProductByName(String name) ;

	public void delete(int pid) ;
	public List<Product> list();

}
