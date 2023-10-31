package com.edu.grooming.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.error.GlobalException;
import com.edu.grooming.repository.SalonRepository;
import com.edu.grooming.service.SalonService;

@RestController
public class SalonController {

	@Autowired
	private SalonService salonService;
	
	@Autowired
	private SalonRepository salonRepository;

	@PostMapping("/saveSalon") //http://localhost:8990/saveSalon
	public ResponseEntity<Salon> saveSalon(@Valid @RequestBody Salon salon) throws GlobalException {
		Salon salon1 = salonRepository.findBySalonemailidOrSalonphone(salon.getSalonemailid(),salon.getSalonphone());
		if(salon1!=null) {
			System.out.println("Email and phonenumber already exist!");
			throw new GlobalException("Salon already exist!");
		}
		
		Salon salon2 = salonService.saveSalon(salon);
		return new ResponseEntity<Salon>(salon2,HttpStatus.CREATED);
		
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
