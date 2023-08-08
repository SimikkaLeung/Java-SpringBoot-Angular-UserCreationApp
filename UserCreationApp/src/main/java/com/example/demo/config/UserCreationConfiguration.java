package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dao.UserRepository;
import com.example.demo.dao.UserRepositoryImpl;

@Configuration
public class UserCreationConfiguration {
	@Bean
	public UserRepository userRepo() {
		return new UserRepositoryImpl();
	}
	
}
