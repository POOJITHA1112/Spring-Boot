package com.entity;

public class CountryRequest {

	private String country;

	public CountryRequest() {
		// TODO Auto-generated constructor stub
	}

	public CountryRequest(String country) {
		super();
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CountryRequest [country=" + country + "]";
	}
	
}
