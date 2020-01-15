package com.pass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pass.repository.HighestDegreeEntity;
import com.pass.repository.PassedOutYearEntity;
import com.pass.repository.UniversityEntity;

@Service
public class PassportServiceImpl implements PassportService {
    @Autowired
	private HighestDegreeEntity hdeRepo;
    
    @Autowired
    private PassedOutYearEntity poyeRepo;
    
    @Autowired
    private UniversityEntity ueRepo;
	
	@Override
	public List<String> getAllDegree() {
        List<String> degreeListEntity = hdeRepo.findAllDegree();
		return degreeListEntity;
	}

	@Override
	public List<Integer> getAllYear() {
        List<Integer> yearListEntity = poyeRepo.findAllYear();
		return yearListEntity;
	}

	@Override
	public List<String> getAllUniversity() {
           List<String> universityListEntity = ueRepo.findAllUniversity();
		return universityListEntity;
	}

}
