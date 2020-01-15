package com.pass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PASSED_OUT_YEAR")
public class PassedOutYearEntity {
    
	@Id
	@Column(name="YID" ,length=20)
	private Integer yId;
	
	@Column(name="YEAR" ,length=20)
	private Integer Year;
}
