package list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyIntegerDescendingComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1; // Descending order
	}
}

class MyIntegerAscendingComparator implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o1 - o2; // Ascending order
	}
}

class MyStringAscendingComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

class MyStringDescendingComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}
}

public class ComparatorsDemo {
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(9, 8, 7, 6, 5, 5, 4, 3, 2, 1);
		System.out.println(asList);

//		USING COMPARATORS

		asList.sort(new MyIntegerDescendingComparator());
		System.out.println("Descending order: ");
		System.out.println(asList);

		System.out.println("\n");

		System.out.println("Ascending order: ");
		asList.sort(new MyIntegerAscendingComparator());
		System.out.println(asList);

		System.out.println("\n");

		List<String> asList1 = Arrays.asList("Banana", "Apple", "Mango", "Chekuu", "grapes", "date");

		System.out.println(asList1);

		asList1.sort(null); // Natural (alphabetical) order but according to the ASCII values

		System.out.println(asList1);

		asList1.sort(new MyStringDescendingComparator()); // descending order of length
		System.out.println(asList1);

		asList1.sort(new MyStringAscendingComparator());
		System.out.println(asList1); // ascending order of length

		System.out.println("\n");

//		USING LAMBDA EXPRESSIONS

		List<Integer> asList2 = Arrays.asList(1, 4, 2, 3, 8, 6, 9, 55, 44, 33, 10);
		asList2.sort((a, b) -> a - b); // ascending order
		System.out.println(asList2);

		asList2.sort((a, b) -> b - a);
		System.out.println(asList2); // descending order
	}
}