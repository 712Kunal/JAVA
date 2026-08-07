package map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<String, Integer> treeMap = new TreeMap<>(); // Natural sorting based on keys
		System.out.println(treeMap.getClass().getName()); // TreeMap is a implementation class extends abstractMap
															// abstract class

		treeMap.put("Ajay", 90);
		treeMap.put("Benny", 90);
		treeMap.put("Carry", 90);
		treeMap.put("Dooms", 90);

		System.out.println(treeMap); // sorted in dictionary manner

		SortedMap<Integer, String> treeMap1 = new TreeMap<>();
		treeMap1.put(99, "Ajay");
		treeMap1.put(94, "Ajinkya");
		treeMap1.put(93, "Simran");
		treeMap1.put(92, "Benny");
		treeMap1.put(91, "Carry"); // sorted in natural (ascending) order

		System.out.println(treeMap1);

		System.out.println("\n");

		System.out.println(treeMap1.firstKey());
		System.out.println(treeMap1.lastKey());
		System.out.println(treeMap1.headMap(91));
		System.out.println(treeMap1.tailMap(92)); // {92=Benny, 95=Ajay}

		System.out.println(treeMap1.subMap(91, 99)); // right argument excluded (excluding 99=Ajay)

		TreeMap<Integer, String> descendingMap = new TreeMap<>((a, b) -> b - a);
		descendingMap.putAll(treeMap1);

		System.out.println("\nIn descending order using comparator: ");
		System.out.println(descendingMap);

		System.out.println("\n");

		NavigableMap<Integer, String> naviMap = new TreeMap<>();
		System.out.println(naviMap.getClass().getName()); // TreeMap implementation class implements NavigableMap
															// Interface which extends SortedMap Interface
		naviMap.put(1, "One");
		naviMap.put(2, "Two");
		naviMap.put(3, "Three");
		naviMap.put(4, "Four");
		naviMap.put(5, "FIve");
		System.out.println(naviMap);

		System.out.println(naviMap.lowerKey(6)); // Returns the greatest key strictly less than the given key, or null
													// if there is no such key.
		System.out.println(naviMap.ceilingKey(1)); // Returns the least key greater than or equal to the given key, or
													// null if there is no such key.
		System.out.println(naviMap.higherEntry(1)); // Returns a key-value mapping associated with the least key
													// strictly greater than the given key, or null if there is no such
													// key.
	}
}
