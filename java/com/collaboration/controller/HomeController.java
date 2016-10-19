package com.collaboration.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.collaboration.dao.UserDAO;
import com.collaboration.model.Message;
import com.collaboration.model.OutputMessage;
import com.collaboration.model.User;

@Controller
public class HomeController {

	@RequestMapping
	public ModelAndView aaa() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}

	@ModelAttribute
	public Object returnObject() {
		return new User();

	}

	@RequestMapping("/SignUp")
	public ModelAndView bbb() {
		ModelAndView mv = new ModelAndView("SignUp");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView ccc() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/newchat")
	public ModelAndView ddd() {
		ModelAndView mv = new ModelAndView("chatpage");
		return mv;
	}

	 @MessageMapping("/chat")
	 @SendTo("/topic/message")
	 public OutputMessage sendMessage(Message message) {
	 return new OutputMessage(message, new Date());
	  }
	
	
	@Autowired
	private UserDAO userDAO;
	User user;

	@RequestMapping("/register")
	public String createUser(@ModelAttribute("user") User user, @RequestParam("img") MultipartFile file, Model model,
			HttpServletRequest request) throws IOException {
		String filename;
		byte[] bytes;

		user.setRole("ROLE_USER");

		// user.setAuthority("ROLE_ADMIN");
		user.setEnabled(true);
		user.setAdmin(false);
		user.setAuthority("ROLE_USER");
		userDAO.saveOrUpdate(user);

		System.out.println("image");
		MultipartFile image = user.getImg();
		Path path;
		path = Paths.get("E:\\friend\\Chatapp\\src\\main\\webapp\\resources\\images\\" + user.getUsername() + ".jpg");

		System.out.println("Path = " + path);
		System.out.println("File name = " + user.getImg().getOriginalFilename());

		if (image != null && !image.isEmpty()) {
			try {
				image.transferTo(new File(path.toString()));
				System.out.println("Image Saved in:" + path.toString());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Image not saved");
			}
		}
		return "login";
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		System.out.println("\nSignUp page Controller has called - / ");
		ModelAndView prh = new ModelAndView("index");
		return prh;
	}

	@RequestMapping(value = "/login_session_attributes")
	public String login_session_attributes(HttpSession session, ModelMap model) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("1");

		// User user = userService.getUserByName(name);

		System.out.println("2");

		// session.setAttribute("userId", user.getId());
		System.out.println("3");

		session.setAttribute("username", name);

		session.setAttribute("LoggedIn", "true");

		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();

		String role = "ROLE_USER";
	//	user.setAuthority("ROLE_USER");
		for (GrantedAuthority authority : authorities) {

			if (authority.getAuthority().equals(role)) {

		
				System.out.println("success user login");
				return "home";

			}

			else
				return "home";
		}
		return "login";
	}
}
