package com.collaboration.dao;

import java.util.List;

import com.collaboration.model.Blog;
import com.collaboration.model.Forum;



public interface ForumDAO {
	public List<Forum> getForumList(String user_name);
	public List<Forum> getForum();
	public void createNewForum(Forum forum);
	public Blog getForumById(int id);
	public Blog getForumByName(String name);
	public void delete(int id);
}
