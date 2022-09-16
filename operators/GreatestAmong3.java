package operators;

import java.util.Scanner;

public class GreatestAmong3 {

	public static void main(String[] args) {
		
		float num1, num2, num3;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers");
		num1 = s.nextFloat();
		num2 = s.nextFloat();
		num3 = s.nextFloat();

// Using Ternary Operator
		
		
		int n1 = 2;
		int n2 = 3;
		
//		String answer = (n1>n2)? "n1 is greater" : "n2 is greater";
//		
//		String answer2 = (n1>n2)? "n1 is greater" :(n1<n2)? "n2 is greater" : "n1 and n2 are equal";
//		
//		if (n1>n2)
//		{
//			System.out.println("n1 is greater");
//		}
//		
//		else if (n1<n2)
//		{
//			System.out.println("n2 is greater");
//		}
//		
//		else
//		{
//			System.out.println("n1 and n2 are equal");
//		}
//		
		
		
		String result = (num1>num2 && num1>num3)? "num1 is greater"  : (num2>num3)? "num2 is Greater" : "num3 is greater" ;
//		System.out.println(result);

		
// Using if else if else
		
//		if (num1>num2 && num1>num3) {
//			
//			System.out.println("num1 is greater");
//			
//		}
//		
//		else if (num2>num3) {
//		
//			System.out.println("num2 is Greater");
//				
//			}
//			
//		else {
//
//			System.out.println("num3 is greater");
//		
//	 }
		
		
// Using Nested IF
		
		if (num1 > num2 && num1 > num3)
			{
				System.out.println("num1 is greater");
			}
		
		else
		{
			if (num2 > num3)
				{
					System.out.println("num2 is greater");
				}
			else {
				System.out.println("num3 is greater");
			}
		}
		
		
	}

}
