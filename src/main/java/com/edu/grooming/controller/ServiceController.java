package com.edu.grooming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Service;
import com.edu.grooming.service.ServiceService;

@RestController
public class ServiceController {

	@Autowired
	private ServiceService serviceService;
	
	@PostMapping("/saveService")	//http://localhost:8990/saveService
	public Service saveService(@RequestBody Service service){
		return serviceService.saveService(service);
	}


	@PutMapping("/updateServiceSalon/{serviceid}/{salonid}") // http://localhost:8990/updateServiceSalon
	public Service updateServiceSalon(@PathVariable("serviceid") Integer serviceid, @PathVariable("salonid") Integer salonid) {
		return serviceService.updateServiceSalon(serviceid, salonid);
	}
	
	@GetMapping("/getAllService") // http://localhost:8990/getAllService
	public List<Service> getAllService(){
		return serviceService.getAllService();
		
	}
	
}
