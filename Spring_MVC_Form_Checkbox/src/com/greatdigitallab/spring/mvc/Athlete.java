package com.greatdigitallab.spring.mvc;

public class Athlete {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteSport;
	
	private String[] requiredEquipments;

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

	public String getFavouriteSport() {
		return favouriteSport;
	}

	public void setFavouriteSport(String favouriteSport) {
		this.favouriteSport = favouriteSport;
	}

	public String[] getRequiredEquipments() {
		return requiredEquipments;
	}

	public void setRequiredEquipments(String[] requiredEquipments) {
		this.requiredEquipments = requiredEquipments;
	}
	
}