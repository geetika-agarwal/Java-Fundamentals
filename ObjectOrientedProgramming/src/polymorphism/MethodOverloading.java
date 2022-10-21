package polymorphism;

// This is a simple example of method overloading 
// where we use the same name for different methods
// and perform different actions.

class Calculation {

	public void addition(int num1, int num2) {
		System.out.println("The sum of two integer numbers: " + (num1 + num2));
	}

	public void addition(float num1, float num2) {
		System.out.println("The sum of two float numbers: " + (num1 + num2));
	}

	public void addition(int num1, int num2, int num3) {
		System.out.println("The sum of three integer numbers: " + (num1 + num2 + num3));
	}

	public void addition(int num1, float num2) {
		System.out.println("The sume of integer and float is: " + (num1 + num2));
	}

	public void addition(float num1, int num2) {
		System.out.println("The sum of float and integer is: " + (num1 + num2));
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.addition(10, 20);
		cal.addition(14.0F, 17.2F);
		cal.addition(10, 20, 30);
		cal.addition(10, 23.8F);
		cal.addition(12.4F, 30);
	}
}
