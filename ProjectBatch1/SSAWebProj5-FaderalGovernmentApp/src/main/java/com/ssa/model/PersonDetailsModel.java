package com.ssa.model;

import java.util.Date;

import lombok.Data;

@Data
public class PersonDetailsModel {
	
	private String fName;
	private String lName;
	private Date dob;
	private String gender;
	private String state;

}
