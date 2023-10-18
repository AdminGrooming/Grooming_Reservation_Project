package com.edu.grooming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Service;
import com.edu.grooming.service.ServiceService;

@RestController
public class ServiceController {

	@Autowired
	private ServiceService serviceService;
	
	@PostMapping("/saveService")	//http://localhost:8990/saveService
	public Service saveService(@RequestBody Service service)
	{
		return serviceService.saveService(service);
	}
	
}