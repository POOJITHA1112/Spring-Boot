package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int batchNumber;
	private double price;
	private int noOfPr;
	
	public Product() {
		
	}

	public Product(int id, String name, int batchNumber, double price, int noOfPr) {
		super();
		this.id = id;
		this.name = name;
		this.batchNumber = batchNumber;
		this.price = price;
		this.noOfPr = noOfPr;
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

	public int getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(int batchNumber) {
		this.batchNumber = batchNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfPr() {
		return noOfPr;
	}

	public void setNoOfPr(int noOfPr) {
		this.noOfPr = noOfPr;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", batchNumber=" + batchNumber + ", price=" + price
				+ ", noOfPr=" + noOfPr + "]";
	}
	

}
