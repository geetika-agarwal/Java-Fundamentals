package interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunction {
	public static void main(String[] args) {
		UnaryOperator<Integer> increment = (num) -> num + 1;
		UnaryOperator<Integer> sqaure = (num) -> num * num;

		Integer result = increment.andThen(sqaure).apply(5);

		System.out.println(result);
	}
}
