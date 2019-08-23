package com.greatdigitallab.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

	@RequestMapping("/displayForm")
	public String displayForm(Model model) {
		
		// Create Athlete object
		Athlete athlete = new Athlete();
		
		// Add Athlete to Model
		model.addAttribute("athlete", athlete);
		
		return "athlete-form";
	}
	
	@RequestMapping("/registerAthlete")
	public String registerAthlete(@ModelAttribute("athlete") Athlete athlete) {
		
		// Console log the athlete data
		System.out.println("Athlete : " + athlete.getFirstName() + " " + athlete.getLastName());
		
		return "athlete-confirmation";
	}
	
}