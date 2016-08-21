package com.game.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dao.ProductDAO;
import com.game.model.Product;


@Service
public class ProductService implements ProductServiceInterface {
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	SessionFactory sessionFactory;
	public ProductService(){}
	
	public ProductService(SessionFactory sessionfactory){
		sessionFactory=sessionfactory;
	}
	
	public void saveOrUpdate(Product product)
	{
		System.out.println("In productsevice");
		productDAO.saveOrUpdate(product);	
	}
	public List<Product> list()
	{
		List<Product> list=productDAO.list();
		return list;
	}
	public Product get(int pid)
	{
		return productDAO.get(pid);
	}
	public Product getProductByName(String pname)
	{
		return productDAO.getProductByName(pname);
	}
	public void delete(int pid)
	{
		productDAO.delete(pid);
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}
