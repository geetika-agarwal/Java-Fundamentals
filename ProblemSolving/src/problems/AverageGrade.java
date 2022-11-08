package problems;

import java.util.Scanner;

public class AverageGrade {

	public static double average() {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		double sum = 0;

		System.out.println("Enter the grades:");
		do {
			int grade = sc.nextInt();
			if (grade == -1)
				break;
			sum = sum + grade;
			counter++;
		} while (counter < 20);

		double average = sum / counter;

		return average;
	}

	public static void main(String[] args) {
		double avg = average();
		System.out.printf("%.2f", avg);
	}
}
