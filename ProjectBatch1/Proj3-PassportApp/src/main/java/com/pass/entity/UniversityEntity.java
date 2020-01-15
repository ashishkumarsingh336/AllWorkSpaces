package com.pass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="UNIVERSITY")
public class UniversityEntity {
	@Id
	@Column(name="UNID",length=10)
	private Integer unId;
	
	@Column(name="UNIVERSITYNAME",length=30)
	private String universityName;

}
