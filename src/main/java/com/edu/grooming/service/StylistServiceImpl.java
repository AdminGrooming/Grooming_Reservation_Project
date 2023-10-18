package com.edu.grooming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Stylist;
import com.edu.grooming.repository.StylistRepository;

@Service
public class StylistServiceImpl implements StylistService{
	@Autowired
	private StylistRepository StylistRepository;
	
	@Override
	public Stylist addStylist(Stylist stylist) {
		// TODO Auto-generated method stub
		return StylistRepository.save(stylist);
	}


}
