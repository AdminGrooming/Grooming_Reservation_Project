package com.edu.grooming.service;

import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Stylist;

public interface StylistService {

	Stylist addStylist(Stylist stylist);

	Stylist updateStylistSalon(Integer stylistid, Integer salonid);

}
