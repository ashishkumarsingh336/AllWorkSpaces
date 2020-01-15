package com.ssa.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ssa.model.PersonDetailsModel;
import com.ssa.service.SsaRegistrationService;

@Controller
public class SsaRegistrationController {
	@Autowired
    private SsaRegistrationService ssaService; 
	
	
	
	@RequestMapping(value= "/addDetails")
	public String loadForm(Model model) {
		PersonDetailsModel personModel=new PersonDetailsModel();
		
		List<String> stateList = ssaService.getAllState();
		model.addAttribute("personDetails", personModel);
		model.addAttribute("stateList", stateList);
		
		return "personDetails";
		
	}
	
	@RequestMapping(value="/saveDetails",method=RequestMethod.POST)
	public String handleSubmitButton(@ModelAttribute("personDetails")PersonDetailsModel personModel,RedirectAttributes redirectAttributes) {
		       
		     String SSNNumber = ssaService.savePersonDetails(personModel);
		       
		       if(SSNNumber!=null) {
		    	   redirectAttributes.addFlashAttribute("result", "Registration Successful,Your SSN number is -> "+SSNNumber);
		           return "redirect:addDetails";
		       }
		       
		    	   redirectAttributes.addFlashAttribute("result", "Registration Failed");
		    	 return "redirect:addDetails";  
		
	}
}
