package com.beans;

import java.util.List;

public class BookLibrary {
	private List<Book> books;

	public BookLibrary(List<Book> books) {
		super();
		this.books = books;
	}

	public BookLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void displayBooks() {
		for (Book b : books) {
			System.out.println(b);
		}
	}
}
