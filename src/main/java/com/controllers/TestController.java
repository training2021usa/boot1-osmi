package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TestController {
	
	@GetMapping("/")
	String displayDefaultPage(){
		
		return "test";
		
	}
	
	
	

}
