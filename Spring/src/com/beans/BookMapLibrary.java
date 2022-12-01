package com.beans;

import java.util.Collection;
import java.util.HashMap;

public class BookMapLibrary {
	HashMap<String, Book> bookMap;

	public BookMapLibrary(HashMap<String, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}

	public BookMapLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HashMap<String, Book> getBookMap() {
		return bookMap;
	}

	public void setBookMap(HashMap<String, Book> bookMap) {
		this.bookMap = bookMap;
	}

	public void display() {
		Collection<String> keyVal = bookMap.keySet();

		for (String key : keyVal) {
			System.out.println(key + " --> \t " + bookMap.get(key));
		}
	}
}
