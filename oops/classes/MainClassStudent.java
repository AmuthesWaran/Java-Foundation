package oops.classes;

public class MainClassStudent {

	public static void main(String[] args) {
				
		Student2 amu = new Student2();
		
		
		amu.DisplayDetails();
		
		
		Student2 user = new Student2(1, "User 2", "Chennai");
		
		System.out.println();
		
		user.DisplayDetails();
//		System.out.println();
//		System.out.println("Student ID\t: "+amu.getSId());
//		System.out.println("Student Name\t: "+amu.getSName());
//		System.out.println("Location\t: "+amu.getLoc());
//		
		
		
		
	}

}
