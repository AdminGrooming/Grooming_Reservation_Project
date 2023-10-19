package com.edu.grooming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.grooming.dao.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
}
