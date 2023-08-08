package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

//@Service
public class UserCreationServiceImpl implements UserCreationService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public int addUser(User user) {
		return userRepo.addUser(user);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepo.findUserById(id);
	}

	@Override
	public Integer findMaxUserId() {
		return userRepo.findMaxUserId();
	}

	
	
}
