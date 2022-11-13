package java_fundamental_problems;

import java.util.Scanner;

/*
 * 8.	The process of finding the largest value (i.e., the maximum of a group of values) is used
 *  frequently in computer applications. For example, a program that determines the winner of a sales
 *   contest would input the number of units sold by each sales person. The sales person who sells the
 *    most units wins the contest. Write a Java application that inputs a series of 10 integers and 
 *    determines and prints the largest integer. Your program should use at least the following 
 *    three variables: 
a.	counter: A counter to count to 10 (i.e., to keep track of how many numbers 
have been input and to determine when all 10 numbers have been processed).
b.	number: The integer most recently input by the user.
c.	largest: The largest number found so far.

*/

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, counter = 1, largest = Integer.MIN_VALUE;
		System.out.println("Enter the 10 numbers: ");

		while (counter <= 10) {
			System.out.print("Enter the " + counter + " number: ");
			number = sc.nextInt();
			if (number > largest)
				largest = number;
			counter++;
		}

		System.out.println("The largest number is: " + largest);
	}
}
