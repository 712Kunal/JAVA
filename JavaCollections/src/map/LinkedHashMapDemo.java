package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmpp = new HashMap<>(); // stored randomly

		hashmpp.put("Orange", 200);
		hashmpp.put("Apple", 100);
		hashmpp.put("Grapes", 10);

		System.out.println("\nHashmap -->");
		for (Map.Entry<String, Integer> entry : hashmpp.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

//		getOrDefault() method -->
		Integer orDefault = hashmpp.getOrDefault("Watermelon", 0);
		System.out.println(orDefault); // 0
		Integer orDefault1 = hashmpp.getOrDefault("Orange", 0);
		System.out.println(orDefault1); // 200

//		putIfAbsent() method -->
		hashmpp.putIfAbsent("Watermelon", 20); // "Watermelon" added because it is not present
		System.out.println(hashmpp);
		hashmpp.putIfAbsent("Orange", 100); // Nothing will be added because key "Orange" is already present
		System.out.println(hashmpp);

		System.out.println("\nLinkedHashmap -->");
		LinkedHashMap<String, Integer> linked = new LinkedHashMap<>(); // stored in the form of insertion order
		linked.put("Orange", 200); // first
		linked.put("Apple", 100); // second
		linked.put("Grapes", 10); // third

		for (Map.Entry<String, Integer> entry : linked.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}
}
