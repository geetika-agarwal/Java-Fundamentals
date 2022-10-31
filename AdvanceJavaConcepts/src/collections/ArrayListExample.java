package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("King Kochar");
		list.add("Geetika");
		list.add("Ravi");
		list.add(1, "Sandy");

		System.out.println(list);

//		for (String names : list) {
//			System.out.println(names);
//		}

		list.remove("Sandy");
		System.out.println("The List after removing element: \n" + list);

		list.set(1, "Shreya");
		System.out.println("The List after setting element: \n" + list);

		System.out.println("The index of the element: " + list.indexOf("King Kochar"));

		System.out.println(list.get(0));

		System.out.println("The size of the list: " + list.size());

		System.out.println(list.contains("Geetika"));

		list.clear();
		System.out.println("The list is empty?: " + list.isEmpty());
	}
}
