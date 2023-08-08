package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.model.User;

public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addUser(User user) {
		return jdbcTemplate.update("INSERT INTO users VALUES(DEFAULT,?,?)", user.getFirstName(), user.getLastName());
	}

	@Override
	public User findUserById(Integer id) {
		return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?", BeanPropertyRowMapper.newInstance(User.class), id);
	}

	@Override
	public Integer findMaxUserId() {
		return jdbcTemplate.queryForObject("SELECT MAX(id) FROM users", BeanPropertyRowMapper.newInstance(Integer.class));
	}

}
