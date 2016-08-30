package com.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dao.CategoryDAO;

import com.game.model.Category;


@Service
public class CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	public void saveOrUpdate(Category category)
	{
		categoryDAO.saveOrUpdate(category);	
	}
	public List<Category> list()
	{
		List<Category> list=categoryDAO.list();
		return list;
	}
	public Category get(int id)
	{
		return categoryDAO.get(id);
	}
	public void delete(int id)
	{
		categoryDAO.delete(id);
	}
	public Category getByName(String cname) {

		return categoryDAO.getByName(cname);
	}
	

}
