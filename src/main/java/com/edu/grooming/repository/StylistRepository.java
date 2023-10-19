package com.edu.grooming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.grooming.dao.Stylist;

@Repository
public interface StylistRepository extends JpaRepository<Stylist, Integer> {

}
