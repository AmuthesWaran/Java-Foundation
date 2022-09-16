package getting_inputs;

import java.util.Scanner;

public class Students_Inputs {

	public static void main(String[] args) {
		Integer studentId;
		String studentName;
		Integer age;
		String schoolName;
		Float cgpa;
		char grade;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your Studend ID: ");
		studentId = s.nextInt();
		
		System.out.println("Please Enter your name: ");
		studentName = s.next();
		
		System.out.println("Please Enter your Age: ");
		age = s.nextInt();
		
		System.out.println("Please Enter your School Name");
		schoolName = s.next();
		
		System.out.println("Please Enter your CGPA");
		cgpa = s.nextFloat();
				
		System.out.println("Please Enter your Grade");
		grade = s.next().charAt(0);
		
		System.out.println("Your Student ID is:	"+studentId );
		System.out.println("Your Name is	:"+studentName );
		System.out.println("Your Age is:	"+age );
		System.out.println("Your School Name is:	"+schoolName);
		System.out.println("Your CGPA is:	"+cgpa);
		System.out.println("Your Grade:	"+grade);
		
		
	}

}
