package com.edu.grooming.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.dao.Services;
import com.edu.grooming.repository.SalonRepository;
import com.edu.grooming.repository.ServicesRepository;


@org.springframework.stereotype.Service
public class ServicesServiceImpl implements ServicesService{

	@Autowired
	private ServicesRepository servicesRepository;
	
	@Autowired
	private SalonRepository salonRepository;
	
	
	@Override
	public Services saveServices(Services services) {
		return servicesRepository.save(services);
	}
	
	
	@Override
	public Services updateServicesSalon(Integer servicesid, Integer salonid) {
		Services services = servicesRepository.findById(servicesid).get();
		Salon salon = salonRepository.findById(salonid).get();
		
		services.updateservicesSalon(salon);
		return servicesRepository.save(services);
	}


	@Override
	public List<Services> getAllServices() {
		// TODO Auto-generated method stub
		return servicesRepository.findAll();
	}

}
