package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable int id) {
		Optional<Book> b = bookRepository.findById(id);
		if (b.isPresent())
			return b;
		return b;
	}

}
