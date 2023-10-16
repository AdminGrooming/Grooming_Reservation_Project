package com.edu.grooming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.User;
import com.edu.grooming.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser") //http://localhost:8990/addUser
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
		
	}
	// testing
}
