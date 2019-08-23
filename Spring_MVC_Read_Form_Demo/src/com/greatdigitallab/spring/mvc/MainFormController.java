package com.greatdigitallab.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainFormController {

	// Create a controller method to display main form
	
	@RequestMapping("/displayForm")
	public String displayForm() {
		return "main-form";
	}
	
	//create a controller method for Confirmation page
	
	@RequestMapping("/confirmationForm")
	public String confirmationForm() {
		return "confirmation-form";
	}

}