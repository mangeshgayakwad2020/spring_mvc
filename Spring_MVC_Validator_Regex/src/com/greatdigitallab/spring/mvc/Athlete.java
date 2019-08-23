package com.greatdigitallab.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Athlete {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	private String country;
	private String favouriteSport;
	
	private String[] requiredEquipments;
	
	@Min(value=1, message="must be greater than or equal to 1")
	@Max(value=100, message="must be less than or equal to 100")
	private int age;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars / digits are allowed")
	private String secretCode;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}
	
}