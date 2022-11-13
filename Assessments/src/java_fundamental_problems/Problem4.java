package java_fundamental_problems;

import java.util.Scanner;

/*4.	Write an application that asks the user to enter two integers, 
 * obtains them from the user and prints their sum, product, difference and quotient (division).*/

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number...");
		int a = sc.nextInt();
		System.out.println("Enter second number...");
		int b = sc.nextInt();

		System.out.println("The sum of two numbers is: " + (a + b));
		System.out.println("The difference of two numbers is: " + (a - b));
		System.out.println("The product of two numbers is: " + (a * b));
		System.out.println("The quotient of two numbers is: " + (a / b));
	}
}
