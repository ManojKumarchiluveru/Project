package com.game.dao;

import java.util.List;

import com.game.model.Category;




public interface CategoryDAO {
	public List<Category> list();

	public Category get(int id);

	public void saveOrUpdate(Category category);

	public void delete(int id);


}
