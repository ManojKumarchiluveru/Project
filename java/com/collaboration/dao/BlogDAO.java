package com.collaboration.dao;

import java.util.List;

import com.collaboration.model.Blog;



public interface BlogDAO {
	public void createBlog(Blog b);
	public List<Blog> getBlogList();
	public void deleteBlog(Blog b);	
	public Blog getCompleteBlog(int bid);
	
}
