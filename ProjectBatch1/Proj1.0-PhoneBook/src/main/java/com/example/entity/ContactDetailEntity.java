package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_DETAIL_ENTITY")
public class ContactDetailEntity {
	@GeneratedValue
	@Id
	@Column(name="CONTACT_ID",length =10)
	private Integer contactId;
	
	@Column(name="CONTACT_NAME",length = 50)
	private String contactName;
	
	@Column(name="CONTACT_EMAIL",length = 50)
	private String contactEmail;
	
	@Column(name="PH_NO",length = 10)
	private Long phNo;
}
