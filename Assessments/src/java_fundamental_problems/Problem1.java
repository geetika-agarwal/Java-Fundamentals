package java_fundamental_problems;

import java.util.Scanner;

// Write a program that calculates and prints the product of three integers.

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number...");
		int a = sc.nextInt();
		System.out.println("Enter second number...");
		int b = sc.nextInt();
		System.out.println("Enter third number...");
		int c = sc.nextInt();

		System.out.println(a * b * c);
	}
}
