package getting_inputs;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
// Getting inputs using Scanner
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the 1st number: ");
		Float num1 = s.nextFloat();
		
		System.out.println("Enter the 2nd number: ");
		Float num2 = s.nextFloat();
		
// Calculations
		Float add = num1 + num2;
		Float sub = num1 - num2;
		Float product = num1 * num2;
		Float quotient = num1 / num2;
		Float remainder = num1 % num2;
		
		
		
// Printing the Result
		System.out.println("The Arithmetic Operations for the given nos. are as below:\n");
		System.out.println("Addition\t: "+add);
		System.out.println("Subtraction\t: "+sub);
		System.out.println("Product\t\t: "+product);
		System.out.println("Quotient\t: "+quotient);
		System.out.println("Remainder\t: "+remainder);
		
		
		
	}

}
