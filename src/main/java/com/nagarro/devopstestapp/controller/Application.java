package com.nagarro.devopstestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {

	
	@GetMapping("test-devops-app")
	public String getData() {
		return "Demo application to test devops tools!";
	}
}
