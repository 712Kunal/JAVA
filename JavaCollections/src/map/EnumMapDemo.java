package map;

import java.util.EnumMap;

public class EnumMapDemo {
	public static void main(String[] args) {
		// array of size same as enum
		// [_,"Gym",_,_,_,_,_]
		// no hashing
		// ordinal/index is used
		// FASTER THAN HASHMAP
		// MEMORY EFFICIENT
		EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);

		enumMap.put(Day.TUESDAY, "Gym");
		enumMap.put(Day.SATURDAY, "Yoga");
		enumMap.put(Day.MONDAY, "Running");
		enumMap.put(Day.FRIDAY, "Reading");

		System.out.println(enumMap);
		String s = enumMap.get(Day.MONDAY);
		System.out.println(s);
		System.out.println(enumMap.get(Day.WEDNESDAY)); // null

	}

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
	}
}
