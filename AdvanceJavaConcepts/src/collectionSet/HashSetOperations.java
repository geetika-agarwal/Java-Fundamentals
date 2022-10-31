package collectionSet;

import java.util.HashSet;

public class HashSetOperations {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(600);

		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(700);

		// To find the union of sets
		HashSet<Integer> unionSet = new HashSet<Integer>(set);
		unionSet.addAll(set1);

		System.out.println("Union of set1 and set2: " + unionSet);

		// To find the intersection of sets
		HashSet<Integer> intersectionSet = new HashSet<Integer>(set);
		intersectionSet.retainAll(set1);

		System.out.println("Intersection of set1 and set2: " + intersectionSet);

		// To find the difference of sets
		HashSet<Integer> differenceSet = new HashSet<Integer>(set);
		differenceSet.removeAll(set1);

		System.out.println("Difference of set1 and set2: " + differenceSet);
	}
}
