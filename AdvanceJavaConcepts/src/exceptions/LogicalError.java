package exceptions;

public class LogicalError {
	public static void main(String[] args) {
		// Demonstrating Logical Error
		// Expecting: Number is even.
		// Output: Number is odd.

		int num = 10;
		if (num / 2 == 0)
			System.out.println("Number is even.");
		else
			System.out.println("Number is odd.");
	}
}
