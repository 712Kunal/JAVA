package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list.getClass().getName());

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
//		System.out.println(list.get(5));  EXCEPTION -> Index 5 out of bounds for length 5

		System.out.println("Size of the list: " + list.size());

//		ITERATION
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("\n");

//		USING FOR EACH LOOP
		for (int x : list) {
			System.out.println(x);
		}

		System.out.println(list.contains(50)); // true
		System.out.println(list.contains(90)); // false

		list.remove(4); // removes the item at an index 4
		System.out.println("After removing the item: " + list);

		list.add(3, 100); // adds the element at specific index
		System.out.println("After adding the element at specific index: " + list);

		list.set(3, 40);
		System.out.println("After udating the element at specific index: " + list);

		System.out.println('\n');

		List<String> asList = Arrays.asList("Monday", "Tuesday");
		System.out.println(asList);
		System.out.println(asList.getClass().getName());

		System.out.println("\n");

		String[] fruits = { "Apple", "Banana", "Mango" };
		List<String> asList2 = Arrays.asList(fruits);
		System.out.println(asList2);
		System.out.println(asList2.getClass().getName());

		// It returns a fixed size list, only updation can happen
//		asList2.add("Cherry"); EXCEPTION
		asList2.set(0, "Cherry");
		System.out.println("After udating the element at specific index: " + asList2);

		List<Integer> ofList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9); // returns a unmodifiable list
//		ofList.set(0, 9);  EXCEPTION 

//		We can make asList modifiable to add the elements or to update them 
		ArrayList<String> arrayList = new ArrayList<>(asList2);
		arrayList.add("Santra");
		arrayList.add("Guava");
		arrayList.add("Watermelon");
//		System.out.println("Modifiable asList: ", arrayList); EXCEPTION - The method println(String) in the type
//		PrintStream is not applicable for the arguments (String, ArrayList<String>

		System.out.println(arrayList); // better print like this

		System.out.println('\n');

//		ADDALL method - adding one collection in to another
		List<Integer> ofList1 = List.of(60, 70, 80, 90, 100);
		list.addAll(ofList1);
		System.out.println(list);

		System.out.println('\n');

		arrayList.remove("Santra");
		System.out.println("After removing the element: " + arrayList);

		list.remove(1);
		System.out.println("After removing the element at first index: ");
		System.err.println(list);
		list.add(1, 20);
		System.out.println(list);

		list.remove(Integer.valueOf(40)); // removes the exact element 40
		System.out.println(list);

		System.out.println("\n");

		Integer[] shuffledArray = { 5, 1, 3, 28, 9, 10 };
		List<Integer> asList3 = Arrays.asList(shuffledArray);

		Collections.sort(asList3);
		System.out.println("Sorted List: ");
		System.out.println(asList3);

		System.out.println("\n");

		System.err.println("Anothe way of sorting: ");
		ArrayList<Integer> newShuffledList = new ArrayList<>();
		newShuffledList.add(10);
		newShuffledList.add(2);
		newShuffledList.add(5);
		newShuffledList.add(1);
		newShuffledList.add(90);
		newShuffledList.add(1000);

		System.out.println(newShuffledList);
		newShuffledList.sort(null);
		System.out.println("Sorted List: ");
		System.out.println(newShuffledList);

		newShuffledList.clear(); // clears all the array list
		System.out.println(newShuffledList);
	}
}
