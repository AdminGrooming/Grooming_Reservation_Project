package com.edu.grooming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/getAllAddress") //http://localhost:8990/getAllAddress
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}

}
