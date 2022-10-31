package collectionSet;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("King");
		hashSet.add("Queen");
		hashSet.add("Geetika");
		hashSet.add("Gautam");

		System.out.println("Before Adding Duplicate values: " + hashSet);

		hashSet.add("Geetika");

		System.out.println("After Adding the Duplicate Value: " + hashSet);

		hashSet.add(null);
		hashSet.add(null);

		System.out.println("After adding two nulls: " + hashSet);
	}
}
