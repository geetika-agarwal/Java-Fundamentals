package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootDemoWithSqlConnectivityApplication {

	@Bean
	public JdbcTemplate initializeJdbcTemplate(DataSource datasource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(datasource);
		return jdbcTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoWithSqlConnectivityApplication.class, args);
	}

}
