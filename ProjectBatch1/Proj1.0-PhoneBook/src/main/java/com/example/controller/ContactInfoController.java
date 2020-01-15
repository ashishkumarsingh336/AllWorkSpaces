package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.domain.Contact;
import com.example.service.ContactService;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactService contactService;
	
	/**
	 * Display ContactNumber On Form
	 */	
	@RequestMapping(value="/")
	public String displayContactForm(Model model) {
        Contact c=new Contact();
        model.addAttribute("contact", c);
        return "viewContact";

	}
     @RequestMapping(value="/saveContact", method=RequestMethod.POST)
	public String handleSubmitBtn(Contact c,Model model) {
    	 boolean saveContact = contactService.saveContact(c);
            if(saveContact) {
            	model.addAttribute("sMsg","Contact saved successfully" );
            }
            else {
            	model.addAttribute("sMsg1","Contact not saved try again...");
            }
            
		return "viewContact";

	}
         /**
          *  Displayed all number on the Form
          */
	public String viewContacts(Model model) {

		return null;

	}
}
