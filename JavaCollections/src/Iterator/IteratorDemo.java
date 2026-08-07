package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		for (int i : arrayList) {
			System.out.println(i);
		}

		System.out.println("\n");

//		Internal working of forEach loop (iterator) 
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

//		Iterators also gives functionality of removing elements while iterating instead of using CopyOnWriteArrayList
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);

		Iterator<Integer> iterator2 = numbers.iterator();
		while (iterator2.hasNext()) {
			Integer number = iterator2.next();

			if (number % 2 == 0) {
				iterator2.remove();
			}
		}
		System.out.println("\n" + numbers);
	}
}
