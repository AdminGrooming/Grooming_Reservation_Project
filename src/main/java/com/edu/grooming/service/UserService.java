package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.User;

public interface UserService {

	User addUser(User user);

	List<User> getAllUser();

}
