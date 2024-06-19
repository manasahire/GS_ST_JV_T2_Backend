package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.loginService;

@RestController
@RequestMapping("/login")
@CrossOrigin("http://localhost:4200")
public class loginController {
	
	@Autowired
	loginService loginservice;

	//LoginValidation
	  @PostMapping("/zplogin")
	    public int login(@RequestBody com.entity.login login) {
	        String username = login.getUsername();
	        String password = login.getPassword();
	        String role = login.getRole();
	        
		return loginService.loginValidation(username, password,role);
	  }
}
