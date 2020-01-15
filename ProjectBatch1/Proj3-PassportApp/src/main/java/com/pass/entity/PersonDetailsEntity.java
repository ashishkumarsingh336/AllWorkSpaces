package com.pass.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PERSON_DETAILS")
public class PersonDetailsEntity {
	@Id
	@GeneratedValue
	@Column(name="PID",length=10)
	private Integer pId;
	
	@Column(name="FIRST_NAME",length=20)
	private String fName;
	
	@Column(name="LAST_NAME",length=20)
	private String lName;
	
	@Column(name="EMAIL",length=50)
	private String email;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="GENDER",length=20)
	private String gender;
	
	@Column(name="ADHAR_NO",length=12)
	private Long adharNo;

}
