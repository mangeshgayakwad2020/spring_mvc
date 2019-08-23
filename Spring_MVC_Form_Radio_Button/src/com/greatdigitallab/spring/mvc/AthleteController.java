package com.greatdigitallab.spring.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

	@Value("#{countryOptions}")
	private LinkedHashMap<String, String> countryOptions;
	
	@RequestMapping("/displayForm")
	public String displayForm(Model model) {
		
		// Create Athlete object
		Athlete athlete = new Athlete();
		
		// Add Athlete to Model
		model.addAttribute("athlete", athlete);
		
		// Add countryOptions to Model
		model.addAttribute("countryOptions", countryOptions);
		
		return "athlete-form";
	}
	
	@RequestMapping("/registerAthlete")
	public String registerAthlete(@ModelAttribute("athlete") Athlete athlete) {
		
		// Console log the athlete data
		System.out.println("\nAthlete : " + athlete.getFirstName() + " " + athlete.getLastName());
		System.out.println("Country : " + athlete.getCountry());
		
		return "athlete-confirmation";
	}
	
}