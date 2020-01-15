package com.ssa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssa.entity.PersonDetailEntity;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetailEntity, Integer> {

}
