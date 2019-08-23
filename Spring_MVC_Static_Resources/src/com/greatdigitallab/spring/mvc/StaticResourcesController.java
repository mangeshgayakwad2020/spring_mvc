package com.greatdigitallab.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticResourcesController {

	// Create a controller method to display static resources
	
	@RequestMapping("/displayStaticResources")
	public String displayStaticResources() {
		return "static-resources";
	}
}
