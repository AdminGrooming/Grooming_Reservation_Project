package com.edu.grooming.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.error.BadRequestException;
import com.edu.grooming.error.NotFoundException;
import com.edu.grooming.repository.SalonRepository;
import com.edu.grooming.service.SalonService;

@RestController
public class SalonController {

	@Autowired
	private SalonService salonService;
	
	@Autowired
	private SalonRepository salonRepository;

	@PostMapping("/saveSalon") //http://localhost:8990/saveSalon
	public ResponseEntity<Salon> saveSalon(@Valid @RequestBody Salon salon) throws BadRequestException {
		Salon salon1 = salonRepository.findBySalonemailidOrSalonphone(salon.getSalonemailid(),salon.getSalonphone());
		if(salon1!=null) {
			System.out.println("Email and phonenumber already exist!");
			throw new BadRequestException("Salon already exist!");
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
	
	@DeleteMapping("/deleteSalonByid/{id}") // http://localhost:8990/deleteSalonByid/{id}
	public String deleteSalonByid(@PathVariable("id") Integer salonid) throws NotFoundException {
		return salonService.deleteSalonByid(salonid);
	}
	
	@PutMapping("/updateSalonById/{id}")  // http://localhost:8990/updateSalonById/{id}
	public Salon updateSalonById(@PathVariable("id") Integer salonid,@Valid @RequestBody Salon salon) throws NotFoundException {
		return salonService.updateSalonById(salonid,salon);
		
	}
	
	@PostMapping("/saveServiceBySalonId/{id}") 	 //http://localhost:8990/saveServiceBySalonId/{id}
	public Salon saveServiceBySalonId(@Valid @RequestBody com.edu.grooming.dao.Service service, @PathVariable("id") Integer salonid) throws NotFoundException
	{
		return salonService.saveServiceBySalonId(service,salonid);
//		return salonRepository.findById(salonid).get();
	}
	
}
