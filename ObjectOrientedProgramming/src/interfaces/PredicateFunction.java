package interfaces;

import java.util.function.Predicate;

public class PredicateFunction {
	public static void main(String[] args) {
		Predicate<String> compare = (str) -> str.length() > 5;

		if (compare.test("Hello World"))
			System.out.println("Length greater than 5");
		else
			System.out.println("Length less than 5");
	}
}
