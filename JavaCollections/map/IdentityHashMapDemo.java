package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		String key1 = new String("key");
		String key2 = new String("key");

		System.out.println(Integer.toHexString(key1.hashCode())); // 19e5f
		System.out.println(Integer.toHexString(key2.hashCode())); // 19e5f

		HashMap<String, Integer> mpp = new HashMap<>();
		mpp.put(key1, 1);
		mpp.put(key2, 2); // as the hashcodes are same then the equals method will find the key1 string
							// only and try to replace it or update the value
		System.out.println(key1.equals(key2)); // same address

		System.out.println("\nSize of the map: " + mpp.size());
		for (Map.Entry<String, Integer> entry : mpp.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		String key3 = new String("key");
		String key4 = new String("key");

		IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
		identityHashMap.put(key3, 3);
		identityHashMap.put(key4, 4);
		System.out.println("\nSize of the Identity map: " + identityHashMap.size());
		System.out.println(System.identityHashCode(key3)); // 149928006
		System.out.println(System.identityHashCode(key4)); // 713338599
		for (Map.Entry<String, Integer> entry : identityHashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
