package com.beans;

import java.util.Set;

public class BookSetLibrary {
	Set<Book> bookSet;

	public BookSetLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookSetLibrary(Set<Book> bookSet) {
		super();
		this.bookSet = bookSet;
	}

	public Set<Book> getBookSet() {
		return bookSet;
	}

	public void setBookSet(Set<Book> bookSet) {
		this.bookSet = bookSet;
	}

	public void display() {
		for (Book b : bookSet) {
			System.out.println(b);
		}
	}
}
