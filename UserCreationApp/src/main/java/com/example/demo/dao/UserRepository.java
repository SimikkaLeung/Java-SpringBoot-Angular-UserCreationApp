package com.example.demo.dao;

import com.example.demo.model.User;

public interface UserRepository {
	
	public int addUser(User user);
	public User findUserById(Integer id);
	public Integer findMaxUserId();
	
	
}
