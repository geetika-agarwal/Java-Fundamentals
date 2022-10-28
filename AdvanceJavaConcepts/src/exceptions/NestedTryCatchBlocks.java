package exceptions;

class ExceptionExample {

	public static void NestedTry() {
		int arr[] = { 10, 20, 30, 40 };
		int num1 = 50;
		int num2 = 40;

		try {
			try {
				System.out.println(num1 / num2);
				System.out.println("4th element of the array: " + arr[3]);
				System.out.println("5th element of the array: " + arr[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

			int num = Integer.parseInt("10");
			System.out.println("Number is: " + num);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Remaining Code Here...");
	}
}

public class NestedTryCatchBlocks {
	public static void main(String[] args) {
		ExceptionExample.NestedTry();
	}
}
