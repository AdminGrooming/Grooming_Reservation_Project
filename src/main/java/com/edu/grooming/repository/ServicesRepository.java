package com.edu.grooming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.grooming.dao.Services;





@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer>{
	

}
