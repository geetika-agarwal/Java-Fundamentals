package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private JdbcTemplate jdbcTemplate = null;

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(UserDto userDto) {
		jdbcTemplate.update("insert into user_entity values(?,?,?)", userDto.getId(), userDto.getFirstName(),
				userDto.getLastName());
		System.out.println("Row inserted into table!!");
	}

//	public void insert() {
//		int rowsInserted = jdbcTemplate
//				.update("insert into user_entity (id, firstName, lastName) values(1,'Geetika', 'Agarwal')");
//		System.out.println("Row inserted into table!!");
//	}
}
