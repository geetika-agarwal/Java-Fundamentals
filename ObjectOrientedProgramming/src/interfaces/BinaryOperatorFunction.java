package interfaces;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorFunction {
	public static void main(String[] args) {

		BinaryOperator<Integer> add = (val1, val2) -> val1 + val2;
		Function<Integer, Integer> square = (num) -> num * num;

		Integer result = add.andThen(square).apply(100, 200);
		// First this will add the two numbers and return the sum and then apply the
		// square of this total. The result of the square is then stored in the variable
		// result.

		System.out.println(result);
	}
}
