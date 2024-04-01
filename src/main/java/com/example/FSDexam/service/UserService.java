package com.example.FSDexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.FSDexam.beans.LoginRequest;
import com.example.FSDexam.entity.Usersexam;
import com.example.FSDexam.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public ResponseEntity  login(LoginRequest loginRequest) {
		String email=loginRequest.getEmail();
		String password=loginRequest.getPassword();
		Usersexam usersexam=  userRepo.findByemail(email);
		if(usersexam.getPassword().equals(password)) {
			return new ResponseEntity(usersexam,HttpStatus.OK);
		}
		
		return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	}
	
	
	public void register(Usersexam usersexam) {
		userRepo.save(usersexam);
	}
}
