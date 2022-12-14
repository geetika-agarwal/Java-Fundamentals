package classes;

// Constructor Chaining is used for using the parent class
// constructor from the child class using super();

class Person {
	String name;
	String city;
	String country;

	// Default Constructor
	public Person() {
		// this("John");
		this("Texas", "US");
		this.name = "Geetika Agarwal";
		this.city = "Hyderabad";
		this.country = "India";
	}

	// Parameterized Constructor with one parameter
	public Person(String name) {
		this.name = name;
	}

	// Parameterized Constructor with two parameter
	public Person(String city, String country) {
		this.city = city;
		this.country = country;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Country: " + country);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Person p = new Person();
		p.display();
	}
}
