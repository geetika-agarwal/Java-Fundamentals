package collectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Three");
		list.add(null);
		list.add("Five");
		list.add(null);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(list);
	}
}
