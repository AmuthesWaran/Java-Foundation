package java8Features.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ModifyingthecollactionUsingStreams {

	public static void main(String[] args) {
			
			List<Student> studentList = Arrays.asList(
				
				new Student(12, "Mathi", "Chennai"),
				new Student(23, "Sathi", "Chennai"),
				new Student(1, "Bathi", "Chennai"),
				new Student(2, "Aathi", "Chennai"),
				new Student(13, "Tathi", "Chennai")
				
				);
		
			
//			Function<Student, Student> functionToAddStartsSuffix = (s) -> 
//				{
//					s.setName(s.getName()+"***");
//					return s;
//				};
//				
//				
//				List<Student> filteredAndModifiedStudentList = studentList.stream()
//						.filter(s -> s.getsId() < 10 )
//						.map(functionToAddStartsSuffix)
//						.collect(Collectors.toList());
//				
//				System.out.println(filteredAndModifiedStudentList);
//			
			
				Function<Student, Student> functionToAddStartsSuffix = (s) -> 
				{
					
					if(s.getsId() > 10 )
					{
					s.setName(s.getName()+"***");
					}
					return s;
				};
				
				
				List<Student> filteredAndModifiedStudentList = studentList.stream()
//						.filter(s -> s.getsId() > 10)
						.map(functionToAddStartsSuffix)
						.collect(Collectors.toList());
				
				System.out.println(filteredAndModifiedStudentList);
			
			
		
	}

}
