package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {
	public static void main(String[] args) {
// 	    Set is a collection that can not contains duplicate elements
//		Faster Operations
//		Map -> HashMap, LinkedHashMap, TreeMap, EnumMap
//		Set -> HashSet, LinkedHashSet, TreeSet, EnumSet

		HashSet<Object> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(90);
		set.add(12422);
		set.add(1);

		System.out.println(set); // [1, 2, 12422, 90] => distinct and unordered

		Object[] arr = set.toArray();
		System.out.println("Set converted in to array: " + Arrays.toString(arr)); // [1, 2, 12422, 90]

		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(12422);
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(90);
		linkedHashSet.add(1);
		linkedHashSet.add(99);
		linkedHashSet.add(98);

		System.out.println("\n" + linkedHashSet); // [12422, 1, 2, 90] => distinct and stores in insertion order

		linkedHashSet.addAll(set);
		System.out.println("\n" + linkedHashSet); // [12422, 1, 2, 90, 99, 98]

		linkedHashSet.clear();
		System.out.println("\n" + linkedHashSet); // []

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(12422);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(90);
		treeSet.add(1);
		treeSet.add(99);
		treeSet.add(98);

		System.out.println("\n" + treeSet); // [1, 2, 90, 98, 99, 12422] => distinct and sorted order

		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(12422);
		navigableSet.add(1);
		navigableSet.add(2);
		navigableSet.add(90);
		navigableSet.add(1);
		navigableSet.add(99);
		navigableSet.add(98);

		System.out.println("\n" + navigableSet); // [1, 2, 90, 98, 99, 12422]
		System.out.println(navigableSet.ceiling(101)); // Returns the least element in this set greater than or equal to
														// the given element, or null if there is no such element. =>
														// 12422

		System.out.println(navigableSet.first()); // Returns the first (lowest) element currently in this set. => 1

		System.out.println(navigableSet.floor(101)); // Returns the greatest element in this set less than or equal to
														// the given element, or null if there is no such element. => 99

		System.out.println(navigableSet.higher(12422)); // Returns the least element in this set strictly greater than
														// the
														// given element, or null if there is no such element. => null

		System.out.println(navigableSet.lower(1)); // Returns the greatest element in this set strictly less than the
													// given element, or null if there is no such element. => null

		Object[] array = navigableSet.toArray(); // Returns an array containing all of the elements in this set.
		for (Object element : array) {
			System.out.println(element);
		}
		System.out.println("Using another way: " + Arrays.toString(array)); // [1, 2, 90, 98,
																			// 99, 12422]

		navigableSet.remove(12422);
		System.out.println("\n" + navigableSet); // [1, 2, 90, 98, 99]

		Set<Integer> integers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 32, 32332, 3212); // Returns an unmodifiable set
																					// containing an arbitrary number of
																					// elements.
		System.out.println("\n" + integers); // [2, 3, 4, 5, 6, 7, 8, 9, 32, 32332, 3212, 1]

	}
}
