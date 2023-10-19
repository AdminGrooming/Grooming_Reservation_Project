package com.edu.grooming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.repository.SalonRepository;
import com.edu.grooming.service.SalonService;

@RestController
public class SalonController {

	@Autowired
	private SalonService salonService;
	
	@PostMapping("/saveSalon") // http://localhost:8990/saveSalon
	public Salon saveSalon(@RequestBody Salon salon) {
		return salonService.saveSalon(salon);
		
	}
}
