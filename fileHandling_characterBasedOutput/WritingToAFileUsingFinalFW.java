package fileHandling_characterBasedOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToAFileUsingFinalFW {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input any text");
		String message = s.nextLine();
		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path, true);
			fw.write(message);
			
		} catch (IOException e) {
			System.out.println("File Not Available");
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				fw.close();
				System.out.println("File Closed...");
			} catch (IOException e) {
				System.out.println("unable to close the file");
				e.printStackTrace();
			}
			
		}
		
//		Buffer Reader
//		Buffer Write

		
		
		
		
		
	}

}
