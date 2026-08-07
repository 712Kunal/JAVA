package map;

import java.util.HashMap;
import java.util.Objects;

class Student implements Comparable<Student> {
	String name;
	int marks;

	Student() {

	}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj; // downcast

		if (this.marks == st.marks && this.name == st.name) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "{Marks: " + marks + " Name: " + name + "}";
	}

	public int compareTo(Student o) {
		return Integer.compare(o.marks, this.marks);
	}

}

class Person {
	String name;
	int id;

	Person() {

	}

	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void getPerson() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}

	public void setPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}

}

public class HashCodeAndEqualsMethods {
	public static void main(String[] args) {
		HashMap<Person, String> mpp = new HashMap<>();

		Person p1 = new Person("Alice", 1);
		Person p2 = new Person("Bob", 2);
		Person p3 = new Person("Alice", 1);

		mpp.put(p1, "Engineer"); // hashcode1 --> index1
		mpp.put(p2, "Designer"); // hashcode2 --> index2
		mpp.put(p3, "Manager"); // hashcode 3--> index3
		System.out.println("Person's Class:");
		System.out.println("Size of the Person's map: " + mpp.size());

//		Different hashcodes would be stored at different index in the array --> hashCode(key) % arraySize = index 
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

		System.out.println(p1);
		System.out.println(p1.getClass().getName() + "@" + Integer.toHexString(p1.hashCode())); // same

		HashMap<String, Integer> mpp1 = new HashMap<>();
		mpp1.put("Aarush", 98); // hashcode1 --> index1
		mpp1.put("Rani", 92);// hashcode2 --> index2
//		updating the value of Aarush
		mpp1.put("Aarush", 100); // hashcode1 --> index1 --> equals() --> replace

		System.out.println("\nStudent's Class:");
		Student s1 = new Student("raju", 100);
		System.out.println(s1); // {Marks: 100 Name: raju}

		Student s2 = new Student("jiya", 92);

		Student s3 = new Student("raju", 100);
		System.out.println(s3);

		HashMap<Student, Integer> stmpp = new HashMap<>();
		stmpp.put(s1, 1); // hashcode1 --> index1
		stmpp.put(s2, 2); // hashcode2 --> index2
		System.out.println("Size of the student map: " + stmpp.size());
		stmpp.put(s3, 10); // hashcode1 --> index1 --> equals() --> replace
		System.out.println("Size of the student map: " + stmpp.size());
	}
}
