package com.greatdigitallab.spring.mvc;

import java.util.LinkedHashMap;

public class Athlete {

	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Athlete() {
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("India", "India");
		countryOptions.put("Australia", "Australia");
		countryOptions.put("Netherlands", "Netherlands");
		countryOptions.put("Saudi Arabia", "Saudi Arabia");
		countryOptions.put("Belgium", "Belgium");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
}
