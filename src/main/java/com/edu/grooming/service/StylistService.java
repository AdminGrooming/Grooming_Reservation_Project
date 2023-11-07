package com.edu.grooming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Stylist;

public interface StylistService {

	Stylist addStylist(Stylist stylist);

	Stylist updateStylistSalon(Integer stylistid, Integer salonid);

	List<Stylist> getAllStylist();

	List<Stylist> getStylistByRating(Integer stylistrating);

	List<Stylist> getStylistBySpecialization(String stylistspecialization);

}
