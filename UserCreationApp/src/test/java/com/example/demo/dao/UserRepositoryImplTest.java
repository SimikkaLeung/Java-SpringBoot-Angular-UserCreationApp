package com.example.demo.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
@SpringBootTest
class UserRepositoryImplTest {

	@Autowired
	private UserRepository userRepo;
	
	@Test
	void testFindUserById() {
		
		assertEquals("Simikka", userRepo.findUserById(1).getFirstName());
	}


	@Test
	void testAddUser() {
		User user = new User("Alice", "Wong");
		
		userRepo.addUser(user);
		
		assertEquals("Alice", userRepo.findUserById(3).getFirstName());
	}

}
