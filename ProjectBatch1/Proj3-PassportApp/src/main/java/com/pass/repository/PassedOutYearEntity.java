package com.pass.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PassedOutYearEntity extends JpaRepository<PassedOutYearEntity, Integer> {
     
	@Query(value="SELECT year FROM PassedOutYearEntity")
	public List<Integer> findAllYear();
}
