package interfaces;

import java.util.function.BiFunction;

interface Printer1 {
	void printSomething();
}

class ConsolePrinter1 {
	public ConsolePrinter1() {
		System.out.println("I'm a constructor");
	}

	public static void printSomething() {
		System.out.println("I am printing something");
	}

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public void printInstanceMessage() {
		System.out.println("I'm printing message here...");
	}
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		Printer1 printer = ConsolePrinter1::printSomething;
		printer.printSomething();

		BiFunction<Integer, Integer, Integer> additionCall = ConsolePrinter1::addition;
		int result = additionCall.apply(100, 200);
		System.out.println(result);

		// Reference to an instance method
		ConsolePrinter1 cprinter = new ConsolePrinter1();
		Printer1 printer1 = cprinter::printInstanceMessage;
		printer1.printSomething();

		// Reference to constructor
		Printer1 printer2 = ConsolePrinter1::new;
		printer2.printSomething();
	}
}
