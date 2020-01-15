package com.example.command;

import java.util.Date;

import lombok.Data;

@Data
public class FormRegCommand {
 private String fName;
 private String lName;
 private String email;
 private Long phNo;
 private Date dob;
 private String gender;
 private String country;
 private String state;
 private String city;
  	
}
