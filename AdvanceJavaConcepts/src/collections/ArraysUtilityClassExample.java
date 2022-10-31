package collections;

import java.util.Arrays;
import java.util.List;

public class ArraysUtilityClassExample {
	public static void main(String[] args) {
		Integer numbers[] = { 10, 20, 30, 40, 50 };

		// Sorting of array
		Arrays.sort(numbers);
		List<Integer> list = Arrays.asList(numbers);

		System.out.println(list);
		System.out.println("Element found at: " + Arrays.binarySearch(numbers, 40));
	}
}
