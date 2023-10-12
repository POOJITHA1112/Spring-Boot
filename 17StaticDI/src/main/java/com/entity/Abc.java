package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private static String name="BALAJI";
	private double salary;
	
	public Abc() {
		// TODO Auto-generated constructor stub
	}

	public Abc( String name, double salary) {
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Abc [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
