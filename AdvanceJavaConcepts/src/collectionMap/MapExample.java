package collectionMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Geetika");
		map.put(101, "Ravi");
		map.put(102, "King");
		map.put(103, "Queen");
		map.put(104, "Prince");

		System.out.println(map);

		map.put(104, "John");

		map.putIfAbsent(104, "Smith");

		System.out.println(map);

		System.out.println("Is the hashmap empty?: " + map.isEmpty());
		System.out.println("Size of the hashmap: " + map.size());

		int keyCheck = 106;
		if (map.containsKey(keyCheck)) {
			System.out.println("The key exists. The value is: " + map.get(keyCheck));
		} else {
			System.out.println("The key doesn't exist");
		}

		String valueCheck = "Geetika";
		if (map.containsValue(valueCheck)) {
			System.out.println("The value exists");
		} else {
			System.out.println("The value doesn't exist");
		}

		Set<Map.Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);

		Set<Integer> setKey = map.keySet();
		System.out.println(setKey);

		Collection<String> setValue = map.values();
		System.out.println(setValue);

		System.out.println("******************************");

		map.forEach((pId, pName) -> {
			System.out.println(pId + " " + pName);
		});

		System.out.println("******************************");

		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("******************************");

		map.entrySet().forEach((entry) -> {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		});

		System.out.println("******************************");

		map.keySet().forEach((person) -> {
			System.out.println(person + " " + map.get(person));
		});

		System.out.println("******************************");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
