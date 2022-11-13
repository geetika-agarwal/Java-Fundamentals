package java_oops_problems;

/*5.	Create a class called Book to represent a book. 
 * A Book should include four pieces of information, for instance variables‐
 * a book name, an ISBN number, an author name and a publisher. 
 * Your class should have a constructor that initializes the four instance variables. 
 * Provide a mutator method and accessor method (query method) for each instance variable. 
 * In addition, provide a method named getBookInfo that returns the description of the book 
 * as a String (the description should include all the information about the book). 
 * You should use this keyword in member methods and constructor. 
 * Write a test application named BookTest to create an array of object for 3 elements 
 * for class Book to demonstrate the class Book's capabilities.*/

class Book {
	String bookName;
	String isbnNumber;
	String author;
	String publisher;

	public Book(String bookName, String isbnNumber, String author, String publisher) {
		super();
		this.bookName = bookName;
		this.isbnNumber = isbnNumber;
		this.author = author;
		this.publisher = publisher;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookInfo() {
		return "Book Name: " + this.bookName + "\nBook ISBN Number: " + this.isbnNumber + "\nBook Author Name: "
				+ this.author + "\nBook Publisher Name: " + this.publisher + ".\n";
	}
}

public class Problem5 {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("Book1", "ISBN 1", "Author 1", "Publisher 1");
		books[1] = new Book("Book 2", "ISBN 2", "Author 2", "Publisher 2");
		books[2] = new Book("Book 3", "ISBN 3", "Author 3", "Publisher 3");

		for (Book book : books) {
			System.out.println(book.getBookInfo());
			System.out.println("-------------------------------------");
		}
	}
}
