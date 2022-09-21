package exceptionHandlingUncheckedException;


public class AccessArrayIndexes {
	
	public static void main(String[] args)
	{
		int[] numsArr = {32, 12, 45, 65, 76};
		
		try {
			for (int i=0; i<numsArr.length; i++)
				{
					System.out.println("hi");
				}
//			
			System.out.println(numsArr[5]);
			
			}
		
		catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
			
			
//			int check = 10;
//			
//			try {
//			while (check > 1) 
//			{
//				System.out.println("hi");
//			}
//			}
//			
//			catch(ArrayIndexOutOfBoundsException e){
//				System.out.println(e.getMessage());
//			}
	}	
	
}
