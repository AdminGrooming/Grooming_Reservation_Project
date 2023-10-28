package com.edu.grooming.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.dao.Service;
import com.edu.grooming.repository.SalonRepository;
import com.edu.grooming.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceImpl implements ServiceService{

	@Autowired
	private ServiceRepository serviceRepository;
	
	@Autowired
	private SalonRepository salonRepository;
	
	
	@Override
	public com.edu.grooming.dao.Service saveService(Service service) {
		return serviceRepository.save(service);
	}
	
	
	@Override
	public Service updateServiceSalon(Integer serviceid, Integer salonid) {
		Service service = serviceRepository.findById(serviceid).get();
		Salon salon = salonRepository.findById(salonid).get();
		
		service.updateServiceSalon(salon);
		return serviceRepository.save(service);
	}


	@Override
	public List<Service> getAllService() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}

}
