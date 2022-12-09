package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo4Application implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo4Application.class, args);
		System.out.println("Application Started!!");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookRepository.save(new Book("Java in Practical", "AP123"));
		bookRepository.save(new Book("Java in Action", "AP456"));
		bookRepository.save(new Book("Java Along with Spring", "AP789"));
		System.out.println("Data inserted!!");

		System.out.println("The Books in the Database is: ");
		for (Book book : bookRepository.findAll()) {
			System.out.println(book);
		}

//		System.out.println("The book with Id as 2 is: ");
//		System.out.println(bookRepository.findById(2).get());
//
//		System.out.println("The count of the no. of Books in the Database: " + bookRepository.count());

//		System.out.println("Delete the book with id as 2");
//		bookRepository.deleteById(2);
//
//		System.out.println("The Books in the Database is: ");
//		for (Book book : bookRepository.findAll()) {
//			System.out.println(book);
//		}
	}

}
