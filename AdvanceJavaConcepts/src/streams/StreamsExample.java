package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {
	public static void main(String[] args) {

		// Empty Stream
		Stream<String> stream = Stream.empty();

		// Printing Stream Elements:
		stream.forEach(element -> {
			System.out.println(element);
		});

		// Creating Stream with String Elements
		Stream<String> stringStream = Stream.of("King", "Queen", "Prince");

		stringStream.forEach(string -> {
			System.out.println(string);
		});

		System.out.println("----------------------------------------------------------");

		// Creating Stream with Integer Elements:
		Stream<Integer> integerStream = Stream.of(100, 200, 300, 400);

		integerStream.forEach(integer -> {
			System.out.println(integer);
		});

		System.out.println("----------------------------------------------------------");
		Integer[] numArray = { 100, 200, 300, 400 };

		// Stream<Integer> arrayStream = Stream.of(numArray);
		Stream<Integer> arrayStream = Arrays.stream(numArray);
		arrayStream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("----------------------------------------------------------");
		// Stream of already created Collection
		List<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(1200);
		list.add(1400);
		list.add(1600);

		Stream<Integer> collectionStream = list.stream();
		collectionStream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("----------------------------------------------------------");

		Stream<String> builderStream = Stream.<String>builder().add("Geetika").add("Ravi").build();

		builderStream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("----------------------------------------------------------");
		// Stream to generate ranges
		IntStream rangeStream = IntStream.range(3, 10);
		rangeStream.forEach(element -> {
			System.out.println(element);
		});
	}
}
