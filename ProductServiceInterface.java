package com.game.service;

import java.util.List;

import com.game.model.Product;

public interface ProductServiceInterface {
	
	public void saveOrUpdate(Product product);
	public List<Product> list();
	public Product get(int pid);
	public void delete(int pid);

}
