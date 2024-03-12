package com.star.agile.assignment.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToStarterProject {
	
	@GetMapping("/welcome")
	public String SpringStarter() {
		return "index.html";
		
	}
}
