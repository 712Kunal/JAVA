package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		System.out.println("Default capacity of vector: " + vec.capacity()); // default capacity - 10

		Vector<Integer> vec1 = new Vector<>(5); // initialized with capacity - 5
		System.out.println("Defined capacity of vector: " + vec1.capacity());

		vec1.add(1);
		vec1.add(1);
		vec1.add(1);
		vec1.add(1);
		vec1.add(1);
		vec1.add(5, 2); // adding element at the specific index
		System.out.println("\nVector1: " + vec1);

		// as the capacity exceeds by adding the number, it increases by 2x of initial
		// capacity
		vec1.add(1);
		System.out.println("Capacity of vec2 after adding beyound the capacity: " + vec1.capacity()); // 5 * 2 = 10

		Vector<Integer> vec2 = new Vector<>(2, 3); // initial capacity - 2 and additional rate 3
		vec2.add(1);
		vec2.add(2);
		System.out.println(vec2);
		System.out.println("\nCapacity of vec2: " + vec2.capacity());
		vec2.add(3); // 2 + 3 = 5
		System.out.println("Capacity of vec2 after adding beyound the capacity: " + vec2.capacity());
		System.out.println(vec2);

		Vector<Integer> vec3 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("\nVecotor3: " + vec3);

		System.out.println("\n");

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		Vector<Integer> vec4 = new Vector<>(linkedList);
		System.out.println("Vector4: " + vec4);
		System.err.println("Element at index 1: " + vec4.get(1));

		vec4.set(5, 8); // replacing the element at index 5
		System.out.println("After the updation: " + vec4);

		vec4.add(1);
		vec4.remove(0); // removes the element at the specified index
		System.out.println("After removing the element: " + vec4);
		vec4.add(0, 1);
		System.out.println("Vec4: " + vec4);
		vec4.remove(Integer.valueOf(1)); // removes the first occurance of specified element
		System.out.println("After removing the element: " + vec4);

		System.out.println("\nIterating over the vector: ");
		for (int i = 0; i < vec4.size(); i++) {
			System.out.println(vec4.get(i));
		}

		System.out.println(vec4.isEmpty());
		System.out.println(vec4.contains(5));
		vec4.clear();
		System.out.println(vec4);
	}
}
