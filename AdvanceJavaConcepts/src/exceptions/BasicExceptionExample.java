package exceptions;

class ArithmeticTest {
	public static void division(int num1, int num2) {
		try {
			int result = num1 / num2;
			System.out.println("Division: " + result);
		} catch (Exception e) {
			System.out.println("Exception Occured");
			System.out.println("Exception: " + e.getMessage());
		}
	}
}

public class BasicExceptionExample {
	public static void main(String[] args) {
		ArithmeticTest.division(10, 2);
		ArithmeticTest.division(10, 0); // This causes exception
	}
}
