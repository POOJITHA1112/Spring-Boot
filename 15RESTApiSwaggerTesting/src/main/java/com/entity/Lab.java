package com.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Builder
public class Lab {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	

}
