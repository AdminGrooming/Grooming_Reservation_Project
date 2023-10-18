package com.edu.grooming.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.edu.grooming.dao.Service;
import com.edu.grooming.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceImpl implements ServiceService{

	@Autowired
	private ServiceRepository serviceRepository;
	@Override
	public com.edu.grooming.dao.Service saveService(Service service) {
		// TODO Auto-generated method stub
		return serviceRepository.save(service);
	}

}
