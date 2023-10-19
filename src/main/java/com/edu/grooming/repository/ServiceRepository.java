package com.edu.grooming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.grooming.dao.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer>{
	

}
