package fileHandlingLegacy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFolderAndManyFiles {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String fileName = "";
		String path = "C:\\Users\\amuth\\Downloads\\newFolder3";
		
		File folder = new File(path);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder not Avaiable and Created a new one");
		}
		
		System.out.println("Input no of files to be created: ");
		int noOfFiles = s.nextInt();
		
		System.out.println("Please input Filename with Extension: ");
		for(int i=0; i < noOfFiles; i++ ) {
			fileName = s.next();
			folder = new File(path+"\\"+fileName);
			try {
				folder.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		System.out.println("Files Created SucessFully");
		
		
	}

}
