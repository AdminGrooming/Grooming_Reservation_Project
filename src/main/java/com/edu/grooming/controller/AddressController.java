package com.edu.grooming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Address;
import com.edu.grooming.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/addAddress") //http://localhost:8990/addAddress
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}
	
	
	
}
