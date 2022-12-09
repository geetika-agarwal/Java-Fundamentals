package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApplication {

	@Value("${spring.application.user}")
	private String user;

	@GetMapping("/")
	public String runTest() {
		return "Running Run Application!!!. The user is: " + user;
	}
}
