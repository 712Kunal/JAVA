package Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	public static void main(String[] args) {
		// Thread-Safe
		// Copy-On-Write Mechanism
		// No Duplicate Elements
		// Iterators Do Not Reflect Modifications

		CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
		ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

		for (int i = 1; i <= 5; i++) {
			copyOnWriteArraySet.add(i);
			concurrentSkipListSet.add(i);
		}

		System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet); // [1, 2, 3, 4, 5]
		System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet); // [1, 2, 3, 4, 5]

		System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
		for (Integer num : copyOnWriteArraySet) {
			System.out.println("Reading from CopyOnWriteArraySet: " + num);
			// Attempting to modify the set during iteration
			copyOnWriteArraySet.add(6);
		}

//		Reading from CopyOnWriteArraySet: 1
//		Reading from CopyOnWriteArraySet: 2
//		Reading from CopyOnWriteArraySet: 3
//		Reading from CopyOnWriteArraySet: 4
//		Reading from CopyOnWriteArraySet: 5
		System.out.println(copyOnWriteArraySet); // [1, 2, 3, 4, 5, 6]

		System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
		for (Integer num : concurrentSkipListSet) {
			System.out.println("Reading from ConcurrentSkipListSet: " + num);
			// Attempting to modify the set during iteration
			concurrentSkipListSet.add(6);
		}
//		Reading from ConcurrentSkipListSet: 1
//		Reading from ConcurrentSkipListSet: 2
//		Reading from ConcurrentSkipListSet: 3
//		Reading from ConcurrentSkipListSet: 4
//		Reading from ConcurrentSkipListSet: 5
//		Reading from ConcurrentSkipListSet: 6
		System.out.println(concurrentSkipListSet); // [1, 2, 3, 4, 5, 6]

	}
}
