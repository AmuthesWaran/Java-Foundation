package oops.classes;

public class Student {
	// create variable as private for security - good practice
	private int sid;
	private String sName;
	private int sAge;
	
	
	
	public void study(){
		System.out.println(sName+"is studying");
	}
	
	
	
	
	public void displayDetails() {
		System.out.println("Student Id: "+sid);
		System.out.println("Student Name: "+sName);
		System.out.println("Student Age: "+sAge);
	}
	
}
