package com.edu.grooming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/getAllUser")  //   http://localhost:8990/getAllUser
	public List<User> getAllUser(){
		return userService.getAllUser();
	}

}
