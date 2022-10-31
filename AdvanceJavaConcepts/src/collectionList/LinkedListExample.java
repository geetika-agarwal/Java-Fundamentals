package collectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("King Kochar");
		list.add("Geetika");
		list.add("Sandy");
		list.add("Ravi");

		System.out.println(list);

		LinkedList<String> preList = new LinkedList<String>();
		preList.add("Amit");
		preList.add("Rohith");
		preList.add("Ajith");

		list.addAll(preList);
		list.addFirst("Geet");
		list.add(2, "Prince Harry");
		list.addLast("Queen Eli");

		System.out.println(list);

//		list.removeFirst();
//		list.removeLast();
//		list.removeAll(preList);
//		System.out.println(list);

		Object obj = list.poll();
		System.out.println("The Element that is removed is: " + obj);
		obj = list.pollFirst();
		System.out.println("The first element that is polled is: " + obj);
		obj = list.pollLast();
		System.out.println("The last element that is polled is: " + obj);

//		list.removeFirstOccurrence("Ravi");
//		list.removeLastOccurrence("Geet");

		System.out.println("The list is: \n " + list);
		System.out.println("The size of list is: " + list.size());

		// Loops of the LinkedList

		// for loop:
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----------------------");

		// for each loop:
		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("-------------------------");

		// while loop
		int count = 0;
		while (count < list.size()) {
			System.out.println(list.get(count));
			count++;
		}

		System.out.println("---------------------");

		// Iterator class
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
