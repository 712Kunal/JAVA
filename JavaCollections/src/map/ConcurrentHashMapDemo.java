package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
		System.out.println(concurrentHashMap.getClass().getName());
	}
}
