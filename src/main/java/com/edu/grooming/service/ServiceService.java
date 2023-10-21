package com.edu.grooming.service;

import com.edu.grooming.dao.Service;

public interface ServiceService {

	Service saveService(Service service);

	Service updateServiceSalon(Integer serviceid, Integer salonid);

}
