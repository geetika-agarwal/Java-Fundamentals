package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApplication {

	@GetMapping(value = "/test")
	public String runTest() {
		return "Test Application Running!!!";
	}
}
