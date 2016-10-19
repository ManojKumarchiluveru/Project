package com.collaboration.dao;

import java.util.List;

import com.collaboration.model.User;



public interface UserDAO {
	
	public List<User> list();
	public User get(int id);
	public void saveOrUpdate(User user);
	public void delete (int id);
	public User getusername(String name);
	public boolean isvaliduser(String user, String pass,boolean isAdmin);

}
