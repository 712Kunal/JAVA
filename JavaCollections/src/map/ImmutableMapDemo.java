package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> mpp = new HashMap<>();
		mpp.put("Kunal", 100);
		mpp.put("Shubham", 90);
		mpp.put("Akshit", 80);
		mpp.put("Vivek", 99);

		Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(mpp);
		System.out.println("\nunmodifiableMap() map ->");
		System.out.println(unmodifiableMap);
//		unmodifiableMap.put("Asshish", 90);  throws exception -  UnsupportedOperationException

//		But we can do mpp.put(null, null); over here and modify the map, so to overcome this Map.of() came
//		But its having the limitation that we can only add 10 key value pairs in the of map to overcome this 
//		Map.ofEntries() has came
		System.out.println("\nMap.of() map ->");
		Map<String, Integer> of = Map.of("A", 1, "B", 2, "C", 3, "D", 4);
		System.out.println(of);
//		of.put("E", 5); throws excepton - UnsupportedOperationException

//		Map.ofEntries -->
		Map<Integer, Integer> ofEntries = Map.ofEntries(Map.entry(1, 2), Map.entry(2, 5), Map.entry(3, 4),
				Map.entry(4, 5));
		System.out.println("\nMap.ofEntries() map ->");
		System.out.println(ofEntries);
//		ofEntries.put(9, 10); throws excepton - UnsupportedOperationException
	}
}
