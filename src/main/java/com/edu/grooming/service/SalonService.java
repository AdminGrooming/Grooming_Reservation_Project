package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.error.NotFoundException;

public interface SalonService  {

	Salon saveSalon(Salon salon);

	List<Salon> getSalon();

	Salon getSalonByName(String salonname);

	String deleteSalonByid(Integer salonid) throws NotFoundException;

	Salon updateSalonById(Integer salonid,Salon salon) throws NotFoundException;

	

}
