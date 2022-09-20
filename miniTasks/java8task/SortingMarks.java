package miniTasks.java8task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMarks {

	private static List<Integer> sortedList;

	public static void main(String[] args) {
		
		List<Integer> marksList = Arrays.asList(13, 51, 85, 98, 100, 78);
		
		sortedList = marksList
								.stream()
								.sorted()
								.collect(Collectors.toList());
		
		
		Integer maxMarks = marksList
								.stream()
								.sorted((m1, m2)-> m2-m1)
								.collect(Collectors.toList())
								.get(0);
		
		Integer minMarks = marksList
				.stream()
				.sorted((m1, m2)-> m1-m2)
				.collect(Collectors.toList())
				.get(0);

		
		System.out.println(sortedList);
		System.out.println("Max Marks :"+maxMarks);
		System.out.println("Min Marks :"+minMarks);
		
	}

}
