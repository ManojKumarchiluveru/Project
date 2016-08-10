package com.game.dao;

import java.util.List;

import com.game.model.User;


public interface UserDAO {
	public List<User> list();

	public User get(int id);

	public void saveOrUpdate(User user);

	public void delete(int id);

	public boolean isValidCredentials(String user,Boolean isAdmin,  String pass);
	public User getUserByName(String uname);

}
