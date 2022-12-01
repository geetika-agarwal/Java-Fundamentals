package com.beans;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class BookNameMapLibrary {
	HashMap<String, List<Book>> bookNameMap;

	public BookNameMapLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookNameMapLibrary(HashMap<String, List<Book>> bookNameMap) {
		super();
		this.bookNameMap = bookNameMap;
	}

	public HashMap<String, List<Book>> getBookNameMap() {
		return bookNameMap;
	}

	public void setBookNameMap(HashMap<String, List<Book>> bookNameMap) {
		this.bookNameMap = bookNameMap;
	}

	public void display() {
		Collection<String> keyValues = bookNameMap.keySet();

		for (String key : keyValues) {
			System.out.println(key + "\t" + bookNameMap.get(key));
		}
	}
}
