package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.Service;

public interface ServiceService {

	Service saveService(Service service);

	Service updateServiceSalon(Integer serviceid, Integer salonid);

	List<Service> getAllService();

}
