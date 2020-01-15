package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.service.ContactService;

@Controller
public class ViewContactController {
	
	@Autowired
	private ContactService contactService;
	
	/**
	 * Modify Contact Number
	 */
	public String editContact(Model model) {
		
		
		return null;
	}
	 
	/**
	 * Delete Contact Number
	 */
	public String deleteContact(HttpRequest req) {
		
		
		return null;
	}
	  /**
	   * Add Contact Number
	   */
	public String addContact(Model model) {
		
		return null;
	}
    
	
}
