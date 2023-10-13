package com.edu.grooming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.grooming.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
