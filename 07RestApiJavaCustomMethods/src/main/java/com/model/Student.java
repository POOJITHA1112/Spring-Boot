package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double fee;

	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student( String name, double fee) {
		this.name = name;
		this.fee = fee;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
	
	
}
