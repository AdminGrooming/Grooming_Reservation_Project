package com.edu.grooming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Stylist;
import com.edu.grooming.service.StylistService;

@RestController
public class StylistController {

	@Autowired
	private StylistService stylistService;
	
	@PostMapping("/addStylist") //http://localhost:8990/addStylist
	public Stylist addUser(@RequestBody Stylist stylist) {
		return stylistService.addStylist(stylist);
	}


	@PutMapping("/updateStylistSalon/{stylistid}/{salonid}")	// http://localhost:8990/updateStylistSalon
	public Stylist updateStylistSalon(@PathVariable("stylistid") Integer stylistid, @PathVariable("salonid") Integer salonid) {
		return stylistService.updateStylistSalon(stylistid, salonid);
	}
	
	@GetMapping("/getAllStylist")  // http://localhost:8990/getAllStylist
	public List<Stylist> getAllStylist() {
		return stylistService.getAllStylist();
	}
}