package com.pass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="HIGHEST_DEGREE")
public class HighestDegreeEntity {
	@Id
	@Column(name="HDID" ,length=20)
   private Integer hdId;
	
	@Column(name="DEGREE",length=30)
   private String degree;
}
