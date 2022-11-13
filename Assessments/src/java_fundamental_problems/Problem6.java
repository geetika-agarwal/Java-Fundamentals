package java_fundamental_problems;

import java.util.Scanner;

/*
 * 6.	Write an application that inputs three integers from the user and displays 
 * the sum, average, product, smallest and largest of the numbers.
 * */

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number...");
		int a = sc.nextInt();
		System.out.println("Enter the second number...");
		int b = sc.nextInt();
		System.out.println("Enter the third number...");
		int c = sc.nextInt();

		System.out.println("The sum of three numbers is: " + (a + b + c));
		System.out.println("The average of three numbers is: " + (a + b + c) / 3);
		System.out.println("The product of three numbers is: " + (a * b * c));

		int min, max;
		if (a < b && a < c)
			min = a;
		else if (b < c)
			min = b;
		else
			min = c;

		if (a > b && a > c)
			max = a;
		else if (b > c)
			max = b;
		else
			max = c;

		System.out.println("The largets of three numbers is: " + max);
		System.out.println("The smallest of three numbers is: " + min);
	}
}
