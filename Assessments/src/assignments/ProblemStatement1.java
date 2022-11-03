/* Problem Statement 1: 

Define a class named as circle that contains two private instance variables: radius (of type double) and 
color (of type String),
with default value of 1.0 and "red", respectively.
Create two overloaded constructors one with default values and
another for assigning radius using parameterized constructor. 
 Also define two public methods display() and getArea() to display the details of Circle 
 and calculate the area.

*************************************************************** */

package assignments;

class Circle {
	double radius = 1.0;
	String color = "red";

	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void display() {
		System.out.println("The radius of the Circle: " + radius);
		System.out.println("The color of the circle: " + color);
	}

	public void getArea() {
		double area = Math.PI * radius * radius;
		System.out.printf("The area of the circle is: %.2f\n", area);
	}
}

public class ProblemStatement1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.0);

		System.out.println("Details of Circle 1: ");
		c1.display();
		c1.getArea();

		System.out.println("**************************************");

		System.out.println("Details of Circle 2: ");
		c2.display();
		c2.getArea();
	}
}
