package com.sks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sks.model.User;
import com.sks.repositoty.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository repository;

	
	@GetMapping("/signup")
	public String showSignupForm(User user) {
		
		return "add-user";
	}
	
	@PostMapping("/addUser")
	public String addUser(User user) {
		
		repository.save(user);
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String showUsersList(Model model) {
		
		model.addAttribute("users", repository.findAll());
		return "index";
	}
	
	
}
