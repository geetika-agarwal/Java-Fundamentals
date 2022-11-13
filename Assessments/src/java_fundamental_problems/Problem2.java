package java_fundamental_problems;

import java.util.Scanner;

//2. Write a program that converts a Fahrenheit degree to Celsius
// using the formula: Celcius = (5/9) (Fahrenheit - 32)

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit...");
		double faren = sc.nextDouble();
		double celi = (5.0 / 9.0) * (faren - 32);
		System.out.println(celi);
	}
}
