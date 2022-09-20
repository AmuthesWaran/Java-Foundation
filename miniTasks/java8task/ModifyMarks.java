package miniTasks.java8task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyMarks {

	public static void main(String[] args) {
			
		
		List<Integer> list = Arrays.asList(29, 15, 35, 40, 1, 90);
		
		
		System.out.println("old Marks: " + list);
		
		
		
		List<Integer> updatedMarks = list
				.stream()
				.map(m-> 
					{
						if (m<35)
						
						{
							
//							Integer d = 35-m;
//							m = m + d;
							m = m + (35-m);
							
							
							
						}
						
						return m;
					})
				.collect(Collectors.toList());
		
		
				System.out.println("new marks: " + updatedMarks);
		
		
	}

}
