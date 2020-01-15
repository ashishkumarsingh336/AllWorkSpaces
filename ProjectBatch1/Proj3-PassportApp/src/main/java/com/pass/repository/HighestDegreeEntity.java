package com.pass.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HighestDegreeEntity extends JpaRepository<HighestDegreeEntity, Integer> {
   
	@Query(value="SELECT degree FROM HighestDegreeEntity")
	public List<String> findAllDegree();
}
