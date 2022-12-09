package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SprintBootApplication auto imports the following Annotations:
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 * 
 * */

// The Application Runner run() will run first after that CommandLineRunner run() 
// will run even though whichever is called first
@SpringBootApplication
public class SpringBootDemoApplication implements ApplicationRunner, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running CommandLineRunner run()....");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running ApplicationRunner run()....");
	}

}
