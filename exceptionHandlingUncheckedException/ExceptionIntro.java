package exceptionHandlingUncheckedException;

import java.io.FileInputStream;
import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {

		// unchecked
		int n1, n2, quotient;
		
		
		Scanner s = new Scanner (System.in);
				System.out.println("Input 2 Numbers");
		
				n1 = s.nextInt();
				n2 = s.nextInt();
		
			try {
					quotient = n1/n2;
					System.out.println("Result: "+quotient);
				}
			catch (ArithmeticException error)
				{
					System.out.println("Unable to divide a number by zero");
					System.out.println(error);
				}
		
		
				String ptr = null;
			
			System.out.println(ptr.equals("git"));
		
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\amuth\\Desktop\\test.txt");
//		
//		System.out.println(fis);
		
		
		
		
		
		
		
		
	}

}
