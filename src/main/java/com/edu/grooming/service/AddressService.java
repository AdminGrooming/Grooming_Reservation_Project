package com.edu.grooming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Address;

@Service
public interface AddressService {

	public Address addAddress(Address address);

	public List<Address> getAllAddress();

}
