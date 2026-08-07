package list;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);

		System.out.println("Stack: " + st);

		int removedElement = st.pop();
		System.out.println("\nRemoved element: " + removedElement);
		System.out.println("Stack: " + st);

		System.out.println("\nPeek element: " + st.peek());

		System.out.println(st.isEmpty());
		System.out.println("Size of the stack: " + st.size());

		System.out.println(st.search(8)); // searches from the top of the stack and gives the position
	}
}
