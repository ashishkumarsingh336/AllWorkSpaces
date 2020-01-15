package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ContactDetailEntity;

/**
 * Spring Data is providing jpaRepository
 * and jpaRepository providing cgLib library 
 * which gives proxy class object
 * 
 * jpaRepository provide multiple pre-defined method to perform CURD operation
 */
@Repository
public interface ContactDetailRepository extends JpaRepository<ContactDetailEntity, Long> {
  
	
}
