package collectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(100);
		set.add(60);
		set.add(52);
		set.add(120);
		set.add(21);

		System.out.println(set);

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// To check if the tree set is empty or not
		System.out.println("Is tree set empty? " + set.isEmpty());

		System.out.println("First Element: " + set.first());
		System.out.println("Last Element: " + set.last());
	}
}
