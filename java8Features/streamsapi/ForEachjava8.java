package java8Features.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachjava8 {

	public static void main(String[] args) {
		
		List<Integer> numsList = Arrays.asList(34, 23, 56, 57, 98, 99, 54);
		
		// Traditional For Each Loop
//		for (Integer num: numsList)
//					{
//						System.out.println(num);
//					}
//		
		
		// Java 8 way of using ForEach with the help of Consumer
		Consumer<Integer> consumer = (num) -> System.out.println(num);
		numsList.stream().forEach(consumer);
		
		
		//
		numsList.stream().forEach( System.out::println);
		
		numsList
			.stream()
			.sorted()
			.filter(m-> m > 30 )
			.map(m -> m*2)
			.forEach( System.out::println);
		
		
	}

}
