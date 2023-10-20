package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.Salon;

public interface SalonService  {

	Salon saveSalon(Salon salon);

	List<Salon> getSalon();

	Salon getSalonByName(String salonname);

}
