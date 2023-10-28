package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> getAllAdmin();

}
