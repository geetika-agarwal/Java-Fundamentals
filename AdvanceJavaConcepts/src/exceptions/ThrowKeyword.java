package exceptions;

// Throw keyword helps in throwing the built in exception
// or custom exception manually.

class MyException extends Exception {
	public MyException() {
		super("Not Valid message");
	}

	public MyException(String message) {
		System.out.println(message);
	}
}

class Calculate {
	public static void validate(int age) throws MyException {
		if (age >= 18)
			System.out.println("You can come for voting window.");
		else
			// throw new MyException("You are not valid to vote");
			throw new MyException();
	}
}

public class ThrowKeyword {
	public static void main(String[] args) {
		try {
			Calculate.validate(13);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
