package com.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dao.UserDAO;
import com.game.model.User;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	
	
	public boolean isValidCredentials(String user,Boolean isAdmin,  String pass)
	 {
		 return userDAO.isValidCredentials(user,isAdmin, pass);
		 
		 
	 }

	public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	public User get(int uid)
	{
		return userDAO.get(uid);
	}
	public User getUserByName(String uname)
	{
		return userDAO.getUserByName(uname);
	}
	public void delete(int uid)
	{
		userDAO.delete(uid);
	}


}
