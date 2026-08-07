package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		System.out.println("\nStream creation methods ->");
		List<String> asList = Arrays.asList("apple", "banana", "orange", "pineapple");
		// converting the collection in to streams
		Stream<String> stream = asList.stream();
		System.out.println(stream); // java.util.stream.ReferencePipeline$Head@54bedef2

		String[] arr = { "apple", "banana", "orange", "santra" };
		Stream<String> stream2 = Arrays.stream(arr);
		System.out.println(stream2); // java.util.stream.ReferencePipeline$Head@5caf905d

		Stream<Integer> of = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(of); // java.util.stream.ReferencePipeline$Head@27716f4

		// n -> n+1 (lambda function)
		Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(100);
		System.out.println(iterate); // java.util.stream.SliceOps$1@4a574795

		Stream<Integer> limit = Stream.generate(() -> (int) Math.random() * 100).limit(10);
		System.out.println(limit); // java.util.stream.SliceOps$1@4f023edb

		System.out.println("\n Stream operations ->");

		List<Integer> asList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 12, 15, 1);
		System.out.println("1. Filter operation ->");
		List<Integer> filter = asList2.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filter);

		System.out.println("\n2. Map operation ->");
		List<Integer> mappedList = filter.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(mappedList);

		System.out.println("\n3. Filter and Map operation at a time ->");
		List<Integer> bothOp = asList2.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
		System.out.println(bothOp);

		System.out.println("\n4. Distinct operation ->");
		List<Integer> distinctList = asList2.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct()
				.collect(Collectors.toList());
		System.out.println(distinctList);

		System.out.println("\n5. Sorting in ascending operation ->");
		List<Integer> sortedListAsc = asList2.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(sortedListAsc);

		System.out.println("\n6. Sorting in descending operation ->");
		List<Integer> sortedListDsc = asList2.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct()
				.sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println(sortedListDsc);

		System.out.println("\n7. Adding limit operation ->");
		List<Integer> limitList = asList2.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct()
				.sorted((a, b) -> b - a).limit(4).collect(Collectors.toList());
		System.out.println(limitList);

		System.out.println("\n8. Skipping first elements operation ->");
		List<Integer> skipList = asList2.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct()
				.sorted((a, b) -> b - a).limit(4).skip(1).collect(Collectors.toList());
		System.out.println(skipList);

		System.out.println("\n9. Iterator operation ->");
		List<Integer> iteratorList = Stream.iterate(0, x -> x + 1).limit(101).skip(1).collect(Collectors.toList());
		System.out.println(iteratorList);

		System.out.println("\n10. Peek operation ->");
		// prints the result without explicitly printing the list
		List<Integer> peekList = Stream.iterate(0, x -> x + 1).limit(101).skip(1).filter(x -> x % 2 == 0)
				.map(x -> x / 10).distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());

		System.out.println("\n11. Min and Max operation ->");
		Integer maxEle = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().peek(System.out::println)
				.max((a, b) -> a - b).get();
		System.out.println("Max Element -> " + maxEle); // Max Element -> 5
		Integer minEle = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().peek(System.out::println)
				.max((a, b) -> b - a).get();
		System.out.println("Min Element -> " + minEle); // Min Element -> 0

		System.out.println("\n12. Count operation ->");
		long count = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().count();
		System.out.println(count); // 6
	}
}
