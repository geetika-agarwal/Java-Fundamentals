package java_fundamental_problems;

import java.util.Scanner;

/*
 * 5.	Write an application that asks the user to enter two integers, 
 * obtains them from the user and displays the larger number followed 
 * by the words “is larger”. If the numbers are equal, print “These numbers are equal”. */

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number..");
		int a = sc.nextInt();
		System.out.println("Enter the second number..");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " is larger");
		} else if (b > a)
			System.out.println(b + " is larger");
		else
			System.out.println("These numbers are equal");
	}
}
