package comparable;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
			
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee(101, "Amit", 12));
		al.add(new Employee(102, "Dinesh",20));
		al.add(new Employee(103, "Rohit", 16));
		al.add(new Employee(104, "Sohan", 19));
		al.add(new Employee(105, "Somya", 22));	
		
		System.out.println(al);
			
	}

}
