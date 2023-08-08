package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class userCreationController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepo.addUser(user);
	}
//	
//	@GetMapping("/users")
//	public void submissionSuccessful() {
//		User user = userRepo.findUserById(1);
//		System.out.println(user);
//	}
//	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable("id") Integer id) {
		return userRepo.findUserById(id);
	}
	
	
}
