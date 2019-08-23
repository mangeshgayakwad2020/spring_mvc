package com.greatdigitallab.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainFormController {

	// Create a controller method to display main form
	
	@RequestMapping("/displayForm")
	public String displayForm() {
		return "main-form";
	}
	
	// Create a controller method for Confirmation page
	
	@RequestMapping("/confirmationForm")
	public String confirmationForm() {
		return "confirmation-form";
	}
	
	// Create a Controller method using HttpServletRequest and Model
	
	@RequestMapping("/confirmationFormUsingModel")
	public String confirmationFormUsingModel(HttpServletRequest request, Model model) {
		
		// Read the request parameter from the Html form
		
		String employeeName = request.getParameter("employeeName");
		
		// Convert data to Upper case
		
		employeeName = employeeName.toUpperCase();
		
		// Add name to the Model
		
		model.addAttribute("name", employeeName);
		
		return "confirmation-form-model";
	}

}













