package Assessment;

import java.util.Scanner;

class Car {
	int speed;
	double regularPrice;
	String color;
	Scanner sc = new Scanner(System.in);

	public void getDetails() {
		System.out.println("Enter the speed");
		this.speed = sc.nextInt();
		System.out.println("Enter the Regular Price: ");
		this.regularPrice = sc.nextDouble();
		System.out.println("Enter the color of the car: ");
		this.color = sc.next();
	}

	public double getSalesPrice() {
		return regularPrice;
	}

	public void display() {
		System.out.println("The Car Details are: ");
		System.out.println("Speed: " + speed);
		System.out.println("Regular Price: " + regularPrice);
		System.out.println("Color: " + color);
	}
}

class Truck extends Car {
	int weight;

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Enter Truck Weight");
		this.weight = sc.nextInt();
	}

	@Override
	public double getSalesPrice() {
		double price = super.getSalesPrice();
		if (weight > 2000) {
			return (price - price * 0.1);
		} else {
			return (price - price * 0.2);
		}
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Weight of Truck: " + weight);
	}
}

class Ford extends Car {
	int year;
	int manufacturerDiscount;

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Enter the year of Manufacture: ");
		this.year = sc.nextInt();
		System.out.println("Enter the Manufacturer Discount");
		this.manufacturerDiscount = sc.nextInt();
	}

	@Override
	public double getSalesPrice() {
		double price = super.getSalesPrice();
		return (price - this.manufacturerDiscount);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Year of Manufacture: " + year);
		System.out.println("Manufacture Discount: " + manufacturerDiscount);
	}
}

class Sedan extends Car {
	int length;

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Enter the length of Sedan Car: ");
		this.length = sc.nextInt();
	}

	@Override
	public double getSalesPrice() {
		double price = super.getSalesPrice();
		if (length > 20) {
			return (price - price * 0.05);
		} else {
			return (price - price * 0.1);
		}
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Length of Car: " + length + " feet");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select a Car from options below:");
		System.out.println("1. Truck");
		System.out.println("2. Ford");
		System.out.println("3. Sedan");

		System.out.println("\n Enter your choice: ");
		String choice = sc.next().toLowerCase();
		double finalPrice = 0;

		switch (choice) {
		case "truck":
			Truck truck = new Truck();
			truck.getDetails();
			finalPrice = truck.getSalesPrice();
			truck.display();
			System.out.println("Final Sales Price: " + finalPrice);
			break;
		case "ford":
			Ford ford = new Ford();
			ford.getDetails();
			finalPrice = ford.getSalesPrice();
			ford.display();
			System.out.println("Final Sales Price: " + finalPrice);
			break;
		case "sedan":
			Sedan sedan = new Sedan();
			sedan.getDetails();
			finalPrice = sedan.getSalesPrice();
			sedan.display();
			System.out.println("Final Sales Price: " + finalPrice);
			break;
		default:
			System.out.println("Wrong Choice!!!");
		}
	}

}
