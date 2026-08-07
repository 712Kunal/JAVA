package list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.println(linkedList.getClass().getName());

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		System.out.println(linkedList);

		System.out.println("Value at index 0: " + linkedList.get(0));
		System.out.println("Value at index 1: " + linkedList.get(1));

		linkedList.addFirst(0);
		linkedList.addLast(6);

		System.out.println(linkedList);

		linkedList.removeIf(x -> x % 2 == 0);
		System.out.println(linkedList);

		LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
		LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));

		animals.removeAll(animalsToRemove);
		System.out.println(animals);

		animals.clear();
		System.out.println(animals);

	}
}
