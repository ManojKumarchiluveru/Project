package com.game.dao;

import java.util.List;

import com.game.model.Supplier;



public interface SupplierDAO {
	public List<Supplier> list();

	public Supplier get(int id);

	public void saveOrUpdate(Supplier supplier);

	public void delete(int id);



}
