package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WelcomeController {
   
	@GetMapping
	public String welcomeController() {
		System.out.println("Welcome To HEll");
		return "Welcom";
		
	}
}
