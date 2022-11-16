package interfaces;

// Only one Abstract Method
@FunctionalInterface
interface Printer {
	public void print(String message);
}

class ConsolePrinter implements Printer {
	String msg = "Hi";

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
}

public class FunctionalInterfacesExample {

	static String msg2 = "Welcome";

	public static void main(String[] args) {
		String msg3 = "Java";

		ConsolePrinter cp = new ConsolePrinter();
		cp.print("Hello World!!");

		// Implementing the abstract method using lambda expression
		// Lambda expression can also have access to static, instance and local
		// variables of that method.

		Printer printer = (message) -> System.out.println(message);
		printer.print("Hello World Lambda!!");

		Printer printer2 = (message) -> System.out.println(message + cp.msg + msg2 + msg3);
		printer2.print("Hello ");

		// Anonymous Inner Class

		Printer printer1 = new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message + " in Inner Class");
			};
		};

		printer1.print("Hello World!!");

	}
}
