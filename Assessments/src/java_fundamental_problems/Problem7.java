package java_fundamental_problems;

import java.util.Scanner;

/*
 * 7.	Write an application that reads two integers, determines whether the first is a 
 * multiple of the second and prints the result. [Hint Use the remainder operator.]*/
public class Problem7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();

		if (a % b == 0)
			System.out.println(a + " is a multiple of " + b);
		else
			System.out.println(b + " is not a multiple of " + b);
	}
}
