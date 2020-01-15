package com.ssa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ssa.entity.StateEntity;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Integer>{
    
	@Query(value="SELECT stateName FROM StateEntity")
	public List<String> findAllState();
	
	@Query(value="SELECT stateCode FROM StateEntity WHERE stateName=:sName")
	public String findAllStateCode(String sName);
}
