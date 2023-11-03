package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.Services;





public interface ServicesService {

	Services saveServices(Services service);

	Services updateServicesSalon(Integer serviceid, Integer salonid);

	List<Services> getAllServices();

}
