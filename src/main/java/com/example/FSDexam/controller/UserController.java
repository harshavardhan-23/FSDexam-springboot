package com.example.FSDexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FSDexam.beans.LoginRequest;
import com.example.FSDexam.entity.Usersexam;
import com.example.FSDexam.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	@CrossOrigin
     public ResponseEntity  login( @RequestBody LoginRequest loginRequest ) {
    	return userService.login(loginRequest);
		
	}
	
	@PostMapping("/register") 
	@CrossOrigin
	public void  login( @RequestBody  Usersexam usersexam ) {
    	 userService.register(usersexam);
		
	}

}
