package oops.polymorphis.static_pm;

public class StuMainClass {

	public static void main(String[] args) {
				
			Student student0 = new Student();
			
			student0.displayDetails();
			
			Student student1 = new Student("Student 1", "Beta");
				
			student1.displayDetails();
			
			Student student2 = new Student(2, "student 2", "Gamma");
			
			student2.displayDetails();
				
	}

}
