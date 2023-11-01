package com.edu.grooming.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.error.BadRequestException;
import com.edu.grooming.dao.User;
import com.edu.grooming.repository.UserRepository;
import com.edu.grooming.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/addUser") //http://localhost:8990/addUser
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) throws BadRequestException {
		
		User user1 = userRepository.findByUseremailOrUserphonenumber(user.getUseremail(),user.getUserphonenumber());
		if(user1 != null) {
			System.out.println("User already exist!");
		     throw new BadRequestException("User already exist!");
			 
		}
		
		User user2 = userService.addUser(user);
		
		return new ResponseEntity<User>(user2 ,HttpStatus.CREATED);

	}
	
	@GetMapping("/getAllUser")  //http://localhost:8990/getAllUser
	public List<User> getAllUser(){
		return userService.getAllUser();
	}

}
