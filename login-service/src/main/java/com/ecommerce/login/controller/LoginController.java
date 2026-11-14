package com.ecommerce.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class LoginController {
	
	@GetMapping("/test")
	public String getMethodName() {
		return "Welcome to Login Service";
	}
	

}
