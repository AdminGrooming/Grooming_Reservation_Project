package com.edu.grooming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.service.SalonService;

@RestController
public class SalonController {

	@Autowired
	private SalonService salonService;

	@PostMapping("/saveSalon") //http://localhost:8990/saveSalon
	public Salon saveSalon(@RequestBody Salon salon) {
		return salonService.saveSalon(salon);
		
	}


	@GetMapping("/getSalon")  // http://localhost:8990/getSalon
	public List<Salon> getSalon(){
		return salonService.getSalon();
		
	}

	@GetMapping("/getSalonByName/name/{name}") // http://localhost:8990/getSalonByName/name/
	public Salon getSalonByName(@PathVariable("name") String salonname) {
		return salonService.getSalonByName(salonname);
	}

}
