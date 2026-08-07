package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 2, 1, 5, 11, 90, 100);

		for (int i = 0; i < asList.size(); i++) {
			System.out.println(asList.get(i));
		}

		System.out.println("\nSorted List: ");
		asList.sort(null);
		for (int i = 0; i < asList.size(); i++) {
			System.out.print(asList.get(i) + ", ");
		}

		System.out.println("\n");

		List<Student> st = new ArrayList<>();
		st.add(new Student("kunal", 90));
		st.add(new Student("aayush", 80));
		st.add(new Student("geeta", 90));
		st.add(new Student("geeta", 100));
		st.add(new Student("geeta", 40));
		st.add(new Student("geeta", 80));
		st.add(new Student("geeta", 95));

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}

		st.sort(null);
		System.out.println("\nSorting according to the marks in descending order: ");
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
	}
}
