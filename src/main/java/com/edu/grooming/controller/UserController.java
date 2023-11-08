package com.edu.grooming.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.error.BadRequestException;
import com.edu.grooming.error.NotFoundException;
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
	
	@DeleteMapping("/deleteUserById/{userid}") // http://localhost:/deleteUserById/{userid}
	public List<User> deleteUserById(@PathVariable("userid") Integer userid, @Valid @RequestBody User user){
		return userService.deleteUserById(userid);
		
	}
	
	@PutMapping("/updateUserById/{userid}") //http://localhost:8990/updateUserById/{userid}
	public User updateUserById(@PathVariable("userid") Integer userid ,@Valid @RequestBody User user) throws NotFoundException {
		return userService.updateUserById(userid,user);
	}
	
	@GetMapping("/getUserByEmail/{email}/{password}") //http://localhost:8990/getCustomerByEmail/{email}/{password}
	public User getUserByEmail(@PathVariable("email") String useremail,@PathVariable("password") String userpassword) {
		return userService.getUserByEmail(useremail,userpassword);
	}
	
	@GetMapping("/getUserById/{userid}") //http://localhost:8990/getUserById/{userid}
	public User getUserById(@PathVariable("userid") Integer userid) throws NotFoundException {
		return userService.getUserById(userid);
		
	}
	
	@GetMapping("/getUserByEmailid/{emailid}") //http://localhost:8990/getUserByEmailid/{emailid}
	public User getUserByEmailid(@PathVariable("emailid") String useremail, @RequestBody User user)  {
		return userService.getUserByEmailid(useremail);
		
	}
	

}
