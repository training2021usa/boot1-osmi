package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TestController {
	
	@GetMapping("/")
	String displayDefaultPage(){
		
		System.out.println("this line is done on day2");
		
		return "test";
		
	}
	
	
	

}
