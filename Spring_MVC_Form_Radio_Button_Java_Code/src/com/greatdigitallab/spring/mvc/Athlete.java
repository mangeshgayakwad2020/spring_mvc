package com.greatdigitallab.spring.mvc;

import java.util.LinkedHashMap;

public class Athlete {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteSport;
	
	private LinkedHashMap<String, String> favouriteSportOptions;

	public Athlete() {
		
		favouriteSportOptions = new LinkedHashMap<String, String>();
		favouriteSportOptions.put("Foot Ball", "Foot Ball");
		favouriteSportOptions.put("Basket Ball", "Basket Ball");
		favouriteSportOptions.put("Volley Ball", "Volley Ball");
		favouriteSportOptions.put("Running", "Running");
		favouriteSportOptions.put("Swimming", "Swimming");
		favouriteSportOptions.put("Tracking", "Tracking");
		
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

	public String getFavouriteSport() {
		return favouriteSport;
	}

	public void setFavouriteSport(String favouriteSport) {
		this.favouriteSport = favouriteSport;
	}
	
	public LinkedHashMap<String, String> getFavouriteSportOptions() {
		return favouriteSportOptions;
	}
	
}