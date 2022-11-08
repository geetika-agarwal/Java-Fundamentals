package timecomplexity;

import java.util.List;

class Dummy {
	public void print(int[] numbers) {
		// O(1) + O(1)
		// O(2) => O(1) = Constant Complexity
		System.out.println(numbers[0]); // O(1)
		System.out.println(numbers[1]); // O(1)

		System.out.println("----------------------------------------------");

		// O(n) = Variable length n
		// O(n) - Linear Big O Notation
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Hello " + i);
		}

		System.out.println("----------------------------------------------");

		// O(1) + O(n) + O(1)
		// O(2) + O(n)
		// O(n) - Linear Complexity
		System.out.println(); // O(1)
		for (int num : numbers) {
			System.out.println(num); // O(n)
		}
		System.out.println(); // O(1)

		System.out.println("-----------------------------------------------");

		// O(n) + O(n)
		// O(2n)
		// O(n) - Linear Complexity
		for (int num : numbers) {
			System.out.println(num); // O(n)
		}
		for (int num : numbers) {
			System.out.println(num); // O(n)
		}
	}

	public void display(int[] numbers, String[] names) {

		// O(n) + O(m)
		// O(n) = Linear Big O Notation
		for (int num : numbers) { // O(n)
			System.out.println(num);
		}

		for (String name : names) { // O(m)
			System.out.println(name);
		}
	}

	public void printThree(int[] numbers) {

		// O(n) * O(n)
		// O(n^2) = Quadratic Big O Notation
		for (int first : numbers) { // O(n)
			for (int second : numbers) { // O(n)
				System.out.println(first + " " + second);
			}
		}

		System.out.println("----------------------------------------------");

		// O(n) * O(n) * O(n)
		// O(n^3) = Cubic O Notation
		// O(n^2) = Quadratic O Notation

		for (int first : numbers) {
			for (int second : numbers) {
				for (int third : numbers) {
					System.out.println(first + " " + second + " " + third);
				}
			}
		}
	}

	public boolean isFirstNumberEqualToOne(List<Integer> numbers) {
		return numbers.get(0) == 0;
	}

	public boolean containsNumber(List<Integer> numbers) {
		for (int num : numbers) {
			if (num == 0)
				return true;
		}

		return false;
	}
}

public class BigONotationExample {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		Dummy d = new Dummy();
		d.print(numbers);
	}
}
