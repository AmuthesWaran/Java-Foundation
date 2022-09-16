package java8Features.builtinFuntionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMainClass {

	public static void main(String[] args) {
					
			//Predicate
//						- helps checking a condition and returns a boolean result
			Predicate<String> lengthCheck = name -> name.length() > 5;
			System.out.println(lengthCheck.test("Name"));
		
			
			//Return true if age is > 18
			Predicate<Integer> ageCheck = age -> age > 18;
			System.out.println(ageCheck.test(22));
		
			
			//Function
//						- is a general functional interface that has apply method in it
//						the E apply (T t) accepts any type of arguments and returns any type of value
			// to get the length of a string
			Function<String, Integer> getLength = (message) -> message.length();
			System.out.println("String Length: "+getLength.apply("UPPERCASE"));
			
			
			// to get the given string on lower case 
			Function<String, String> returnsLowerCase = (message) -> message.toLowerCase();
			System.out.println("Lowercase of the given string: "+returnsLowerCase.apply("UpPErCAsE"));
			
			
			Function<Integer, Integer> getNum1 = (num) -> num;
			Function<Integer, Integer> getNum2 = (num) -> num;
			
			System.out.println( (getNum1.apply(2) + getNum2.apply(8)) );
			
			System.out.println((8+2));
			
			
			
			
	}

}
