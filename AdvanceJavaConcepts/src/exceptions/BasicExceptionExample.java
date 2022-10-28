package exceptions;

class ArithmeticTest {
	public static void division(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Exception Occured");
			System.out.println("Exception: " + e.getMessage());
		} finally {
			System.out.println("Division: " + result);
		}
		System.out.println("Remaining Code Here...");
	}
}

public class BasicExceptionExample {
	public static void main(String[] args) {
		ArithmeticTest.division(10, 2);
		ArithmeticTest.division(10, 0); // This causes exception
	}
}
