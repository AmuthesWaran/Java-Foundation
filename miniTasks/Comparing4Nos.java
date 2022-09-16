package miniTasks;

import java.util.Scanner;

public class Comparing4Nos {
	public static void main(String[] args) {
		
		// declaring the variable
		float num1, num2, num3, num4;
		
		Scanner s = new Scanner(System.in);
		// assigning by getting inputs
		
		System.out.println("Enter 4 nos.");
		num1 = s.nextFloat();
		num2 = s.nextFloat();
		num3 = s.nextFloat();
		num4 = s.nextFloat();
		
//		 using if else if
		
//		if (num1 > num2 && num1 > num3 && num1 > num4)
//			{
//				System.out.println("num1 is greater: "+num1);
//			}
//		
//		else if (num2 > num3 && num2 > num4)
//			{
//				System.out.println("num2 is greater: "+num2);
//			}
//		
//		else if (num3 > num4)
//			{
//				System.out.println("num3 is greater: "+num3);
//			}
//		else
//			{
//				System.out.println("num4 is greater: "+num4);
//			}
		
	// nested if
		
		if (num1 > num2 && num1 > num3 && num1 > num4)
			{
				System.out.println(num1+" is greater");
			}
		else
			{
				if(num2 > num3 && num2 > num4) 
					{
						System.out.println(num2+" is greater");
					}
				else
					{
						if(num3 > num4)
							{
							System.out.println(num3+" is greater");
							}
						else
							{
							System.out.println(num4+" is greater");
							}
					}
			}
		
		
		
	}
}
