package fileHandlingLegacy;

import java.io.File;

public class CreatingFolder {

	public static void main(String[] args) {

		File folder = new File("C:\\Users\\amuth\\Downloads\\newFolder");
		
		if(folder.exists()) {
		
			if(!folder.isDirectory()) {
				System.out.println("It is a file");
			}
			
			else {
				System.out.println("It is a folder");
			}
			
		}
		
		else
		{
			// mkdir() will create only one folder
//			folder.mkdir();
			
			
			//To create multiple folders
			folder.mkdirs();
			System.out.println("Folder Created");
		}
		
		
	}

}
