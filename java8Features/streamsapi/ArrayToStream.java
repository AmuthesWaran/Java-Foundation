package java8Features.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {

		

		Integer[] marks = { 21, 3, 43, 55, 34, 67, 20 };
		//Filtered the array elements using stream and creating a new array after filtering		
//		Stream.of(marks).filter(m -> m>35).forEach(System.out::println);
		
		Integer[] array = Stream.of(marks).filter(m -> m>35 ).toArray(Integer[]::new);
		
		// Converting a list into an array
		List<Integer> markList = Arrays.asList(43, 2, 11, 36, 54, 87);
		Integer[] markArray = markList.stream().toArray(Integer[]::new);
		
		
		// Array to List after converting an array into a stream
		List<Integer> marksListFromArray = Stream.of(marks).collect(Collectors.toList());
		
		// Array to set after converting an array into a stream
		Set<Integer> marksSet = Stream.of(marks).collect(Collectors.toSet());
		
		// List to set after converting the list into stream
		markList.stream().collect(Collectors.toList());
		
		// Set to list after converting the set into stream
		markList.stream().collect(Collectors.toSet());
		
		
		
//		for (Integer num : array) {
//			
//			System.out.println(num);
			
			
			
		}
		
	}


