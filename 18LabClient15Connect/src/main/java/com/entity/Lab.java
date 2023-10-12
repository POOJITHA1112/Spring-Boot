package com.entity;


public class Lab {
	
	private int id;
	private String name;
	private String location;
	
	public Lab() {
		// TODO Auto-generated constructor stub
	}

	public Lab(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Lab [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
