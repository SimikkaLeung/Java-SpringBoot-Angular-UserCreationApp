package com.example.demo.service;

import com.example.demo.model.User;

public interface UserCreationService {
	public int addUser(User user);
	public User findUserById(Integer id);
	public Integer findMaxUserId();
}
