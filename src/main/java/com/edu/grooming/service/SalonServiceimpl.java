package com.edu.grooming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.repository.SalonRepository;

@Service
public class SalonServiceimpl implements SalonService {
	
	@Autowired
	private SalonRepository salonRepository;

	@Override
	public Salon saveSalon(Salon salon) {
		// TODO Auto-generated method stub
		return  salonRepository.save(salon);
	}

}
