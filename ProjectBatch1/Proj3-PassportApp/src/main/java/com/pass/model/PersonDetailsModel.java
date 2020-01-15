package com.pass.model;

import java.util.Date;

import lombok.Data;

@Data
public class PersonDetailsModel {
	
	private String fName;
	private String lName;
	private String email;
	private Date dob;
	private String gender;
	private Long adharNo;

}
