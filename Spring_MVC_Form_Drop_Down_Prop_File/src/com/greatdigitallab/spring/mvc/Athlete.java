package com.greatdigitallab.spring.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;

public class Athlete {

	private String firstName;
	private String lastName;
	private String country;
	
	public Athlete() {
		
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
	
}