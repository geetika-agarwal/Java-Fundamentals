package problems;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int counter = 0;
		int largest = Integer.MIN_VALUE;
		int number = 0;

		while (counter < 10) {
			number = sc.nextInt();
			if (number > largest)
				largest = number;
			counter++;
		}

		System.out.println(largest);
	}
}
