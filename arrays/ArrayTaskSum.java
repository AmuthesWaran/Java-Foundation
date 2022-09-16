package arrays;

import java.util.Scanner;

public class ArrayTaskSum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num[] = new int[5];
		int sum = 0;
		
		System.out.println("input array elements");
		
		for(int i=0; i<num.length; i++)
			{
				num[i] = s.nextInt();
				sum = num[i] +sum;
			}

		System.out.println(sum);
	}

}
