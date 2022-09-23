package fileHandlingLegacy;

import java.io.File;
import java.util.Scanner;

public class CreatingManyFolderOneInsideAnother {

	public static void main(String[] args) {
		
//		String path = "C:\\Users\\amuth\\Downloads\\newFolder1";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input no of Folders to be created...");
		int noOfFolder = scanner.nextInt();
		
//		for(int i=1; i<= noOfFolder; i++ ) {
//			path = path + "sub" + i;
//		}
//		
		
		String path1 = "C:\\Users\\amuth\\Downloads\\newFolder1";
		for(int i=1; i<= noOfFolder; i++ ) {
			File file = new File(path1+"\\Folder "+i);
			file.mkdirs();
		}
		
		
		
		System.out.println( noOfFolder + " Folders created Successfully");
	}

}
