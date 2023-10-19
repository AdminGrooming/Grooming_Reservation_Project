package com.edu.grooming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.grooming.dao.Salon;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Integer> {

	

}
