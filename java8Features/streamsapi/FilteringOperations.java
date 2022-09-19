package java8Features.streamsapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringOperations {

	public static void main(String[] args) {
			
		
		List<Student> studentList = Arrays.asList(
				
				new Student(12, "Mathi", "Chennai"),
				new Student(23, "Sathi", "Chennai"),
				new Student(1, "Bathi", "Chennai"),
				new Student(2, "Aathi", "Chennai"),
				new Student(13, "Tathi", "Chennai")
				
				);
		
		//normal and inefficient code
//		
//		for (Student s: studentList)
//			{
//				System.out.println(s);
//			}
		
		
		
		Predicate<Student> myfiltercondition = (s) -> s.getsId() > 10;
		
		// Elabrated Code
//		Stream<Student> studentStream = studentList.stream();
//		Stream<Student> filteredStudentStream = studentStream.filter(myfiltercondition);
//		List<Student> filteredStudentList = filteredStudentStream.collect(Collectors.toList());
//		
		//Simplified code
		List<Student> filteredStudentList = studentList.stream().filter(s -> s.getsId()>2).collect(Collectors.toList());
		
		//Unfiltered List
		System.out.println("Unfiltered");
		System.out.println(studentList);
		//Filtered List
		System.out.println("Filtered");
		System.out.println(filteredStudentList);

		
		// To collect a list into a set - Normal operation
		HashSet<Student> hashset = new HashSet<>();
		for(Student s: studentList)
			{
				hashset.add(s);
			}
				
		
	}

}
