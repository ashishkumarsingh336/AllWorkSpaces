package com.example.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Contact;
import com.example.entity.ContactDetailEntity;
import com.example.repository.ContactDetailRepository;

@Service
public class ContactServiceImpl implements ContactService {
     @Autowired
	private ContactDetailRepository contactDetailsRepository;
	
     /**
      *  Save Contact Number
      */
	@Override
	public boolean saveContact(Contact c) {
        ContactDetailEntity entity=new ContactDetailEntity();
        
		ContactDetailEntity saveEntity = contactDetailsRepository.save(entity);
		BeanUtils.copyProperties(c, saveEntity);
		
		return saveEntity.getContactId()>0;
	}
      
	  /**
	   * Get all Contact Number
	   */
	@Override
	public List<Contact> getAllContacts() {
		
		return null;
	}
           
	  /**
	   * Get Particular Contact Number
	   */
	@Override
	public Contact getContactById(Integer cid) {

		return null;
	}

	@Override
	public boolean updateContact(Contact c) {

		
		return false;
	}
         
	   /**
	    *  Delete Particular Contact Number
	    */
	@Override
	public boolean deleteContactById(Integer cid) {

		
		return false;
	}

}
