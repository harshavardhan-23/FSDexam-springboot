package com.example.FSDexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FSDexam.entity.Usersexam;

@Repository
public interface UserRepo extends JpaRepository<Usersexam, Long>{
	
	public Usersexam findByemail(String email);

}
