package miniTasks.java8task;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8Features.streamsapi.Student;

public class MainClassToPrintTheTask {

	public static void main(String[] args) {
			
			
		List<Student> studentList = Arrays.asList(
				
				new Student(120, "Mathi", "Chennai"),
				new Student(12, "Amuthesh", "Chennai"),
				new Student(1, "Bharathy", "Chennai"),
				new Student(2, "Anath", "Chennai"),
				new Student(113, "Aravind", "Chennai"),
				new Student(143, "Amirtha", "Chennai"),
				new Student(133, "Aravind", "Chennai"),
				new Student(13, "Aravindthan", "Chennai"),
				new Student(134, "Suman", "Chennai"),
				new Student(124, "Sona", "Chennai")
				
				);
		
		
		Function<Student, Student> functionToAddStartsSuffix = (s) -> 
		{
			
			if(s.getsId() > 100 )
			{
			s.setName(s.getName()+"***");
			}
			return s;
		};
		
		
		List<Student> filteredAndModifiedStudentList = studentList.stream()
//				.filter(s -> s.getsId() > 10)
				.map(functionToAddStartsSuffix)
				.collect(Collectors.toList());
		
		System.out.println(filteredAndModifiedStudentList);
	
		
		
		
	}

}
