package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> preList = new LinkedList<String>();

		list.add("King");
		list.add("Queen");
		list.add("Prince");
		list.add("Smith");

		preList.add("Geetika");
		preList.add("Agarwal");

		list.add(1, "Soldier");
		list.addAll(preList);
		list.addFirst("First");
		list.addLast("Last");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
