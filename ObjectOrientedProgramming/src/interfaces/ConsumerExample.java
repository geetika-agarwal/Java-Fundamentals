package interfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> list = List.of(101, 102, 103, 104, 105, 106);

		// Imperative Programming Methodology
		for (Integer integer : list) {
			System.out.println(integer);
		}

		// Internally for each implements Consume interface.
		// Declarative Programming Methodology (Functional Programming)
		list.forEach(item -> System.out.println(item));

		List names = List.of("King", "Queen", "Prince", "Soldier");
		Consumer<String> printNames = item -> System.out.println(item);
		Consumer<String> printUpperCaseNames = item -> System.out.println(item.toUpperCase());
		names.forEach(printNames);
		names.forEach(printUpperCaseNames);

		System.out.println("------------------------------------------");
		System.out.println("Using chaining");

		names.forEach(printNames.andThen(printUpperCaseNames).andThen(printNames));
	}
}
