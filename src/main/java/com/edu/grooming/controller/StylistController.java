package com.edu.grooming.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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

	
}