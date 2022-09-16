package miniTasks;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		
		String uName, pwd;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your UserName :");
		uName = s.next();
		
		System.out.println("Enter your Password :");
		pwd = s.next();
		
		// (uName == pwd)
		
		if( uName.toLowerCase().equals(pwd.toLowerCase()) )
//		if( uName.equals(pwd) )
			{
				System.out.println("\n Welcome "+uName);
			}
		else
			{
				System.out.println("\n User Name and Password doesn't match our record");
			}
		
		
		
		

	}

}
