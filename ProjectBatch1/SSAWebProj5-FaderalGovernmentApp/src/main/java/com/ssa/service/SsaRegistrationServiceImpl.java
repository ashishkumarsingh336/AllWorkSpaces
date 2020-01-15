package com.ssa.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssa.entity.PersonDetailEntity;
import com.ssa.model.PersonDetailsModel;
import com.ssa.repository.PersonDetailsRepository;
import com.ssa.repository.StateRepository;

@Service
public class SsaRegistrationServiceImpl implements SsaRegistrationService {

	@Autowired
	private StateRepository stateRepo;
	
	@Autowired
	private PersonDetailsRepository personRepo;
	
	@Override
	public List<String> getAllState() {
      
		List<String> stateNameList = stateRepo.findAllState();
		return stateNameList;
	}

	@Override
	public String savePersonDetails(PersonDetailsModel personModel) {
        PersonDetailEntity personEntity=new PersonDetailEntity();
        BeanUtils.copyProperties(personModel, personEntity);
        personEntity.setState(stateRepo.findAllStateCode(personModel.getState()));
		 PersonDetailEntity savePerEntity = personRepo.save(personEntity);
		 
		 if(savePerEntity!=null) {
			 String input=String.valueOf(savePerEntity.getSsnNum())
					      .replaceFirst("(\\d{3})(\\d{2})(\\d{4})", "$1-$2-$3");
			
			 return input;
		 }
        return null;
	}

}
