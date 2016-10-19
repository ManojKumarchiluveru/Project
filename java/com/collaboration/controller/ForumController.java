package com.collaboration.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.collaboration.dao.ForumDAO;
import com.collaboration.model.Forum;
import com.google.gson.Gson;


@Controller
public class ForumController {

	@Autowired
	private ForumDAO forumdao;
	
	
	@RequestMapping("/newforum")
	public ModelAndView showForum()
	{
		System.out.println("forum page");
		ModelAndView mv= new ModelAndView("forum");
		return mv;
	}
	@ModelAttribute("forum")
	public Forum returnObject()
	{
		return new Forum();
	}
	@RequestMapping("/fpost")
	public String createBlog(@ModelAttribute("forum") Forum forum,Model model,Principal p )throws IOException
	{
		
		forum.setUser_name("kaushik");
		forum.setCreationDate(new java.util.Date());
		forumdao.createNewForum(forum);
		return "forum";
	}

	String setName;
	List<Forum> flist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon1")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			flist = forumdao.getForum();
			Gson gson = new Gson();			  
			result = gson.toJson(flist);			
			return result;
	}




}
