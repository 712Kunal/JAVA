package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> mpp = new HashMap<>();
		System.out.println(mpp.getClass().getName());

		mpp.put(10, "anish");
		mpp.put(11, "amit");
		mpp.put(12, "shrikant");
		mpp.put(13, "soham");

		System.out.println(mpp);

		String student = mpp.get(10);
		System.out.println(student);
		String student1 = mpp.get(15);
		System.out.println(student1); // null

		System.out.println(mpp.containsKey(10)); // true
		System.out.println(mpp.containsKey(15)); // false

		System.out.println(mpp.containsValue("anish")); // true
		System.out.println(mpp.containsValue("Anish")); // false

		System.out.println("\nIterating through the map using keySet: ");
		Set<Integer> keys = mpp.keySet();
		for (int key : keys) {
			System.out.println(key + " -> " + mpp.get(key));
		}

		System.out.println("\nIterating through the map using entrySet: ");
		Set<Map.Entry<Integer, String>> entries = mpp.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("\nUpdating the values of the map: ");
		Set<Map.Entry<Integer, String>> updateEntries = mpp.entrySet();
		for (Map.Entry<Integer, String> entry : updateEntries) {
			entry.setValue(entry.getValue().toUpperCase());
		}
		System.out.println(mpp);

		System.out.println("\n");

//		values are also replaceable 
		mpp.put(13, "rahul");
		Set<Map.Entry<Integer, String>> entries1 = mpp.entrySet();
		for (Map.Entry<Integer, String> entry : entries1) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("\n");

//		removing the entries in the map
		String remove = mpp.remove(13);
		System.err.println(remove);
		System.out.println(mpp);

	}
}
