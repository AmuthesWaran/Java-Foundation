package fileHandlingLegacy;

import java.io.File;
import java.io.IOException;

public class CheckIfTheFileExists {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\amuth\\Downloads\\test1.txt");
		if(!file.exists()) {
			System.out.println("The File/Folder is Available...");
			
			if(!file.isDirectory()) {
				System.out.println("It is a File");
			}
			
			else {
				System.out.println("It is a directory");
			}
			
		}
		
		
		else {
			System.out.println("File/Folder not found");
		
			try {
				file.createNewFile();
				System.out.println("File is created successfully...");
			} catch (IOException e) {
				System.out.println("Unable to create a new file"+e.getMessage());
//				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
