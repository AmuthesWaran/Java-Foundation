package getting_inputs;
import java.util.Scanner;


public class EmployeeDetails {

	public static void main(String[] args) {
			Integer empId;
			String empFName;
			String empLName;
			Float basicSalary;
			Float esi;
			Float pf;
			Float ta;
			Float hra;
			String location;
			String depatment;
			Float serviceInYears;
			
// Getting inputs using Scanner
			
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter your Employee ID: ");
		empId = s.nextInt();
		
		System.out.println("Please Enter your First Name: ");
		empFName = s.next();
		
		System.out.println("Please Enter your Last Name: ");
		empLName = s.next();
		
		System.out.println("Please Enter your Basic Salary: ");
		basicSalary = s.nextFloat();
		
		System.out.println("Please Enter your ESI: ");
		esi = s.nextFloat();
		
		System.out.println("Please Enter your PF: ");
		pf = s.nextFloat();
		
		System.out.println("Please Enter your Travel Allowance: ");
		ta = s.nextFloat();
		
		System.out.println("Please Enter your HRA: ");
		hra = s.nextFloat();
				
		System.out.println("Please Enter your Location: ");
		location = s.next();
		
		System.out.println("Please Enter your Department: ");
		depatment = s.next();
		
		System.out.println("Please Enter your Service in Years: ");
		serviceInYears = s.nextFloat();
		
		
// Printing out the inputs
		
		System.out.println("Your Employee Details are as below: \n");
		System.out.println("Employee ID\t: "+empId);
		System.out.println("Full Name\t: "+empFName+" "+empLName);
		System.out.println("Basic Salary\t: $"+basicSalary);
		System.out.println("ESI\t\t: $"+esi);
		System.out.println("PF\t\t: $"+pf);
		System.out.println("TA\t\t: $"+ta);
		System.out.println("HRA\t\t: $"+hra);
		System.out.println("Location\t: "+location);
		System.out.println("Department\t: "+depatment);
		System.out.println("Service in Years: "+serviceInYears);	
		

	}

}
