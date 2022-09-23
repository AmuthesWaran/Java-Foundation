package fileHandlingLegacy;

import java.io.File;

public class DeletingFilesInaFolder {

	public static void main(String[] args) {

		
		File folder = new File("C:\\Users\\amuth\\Downloads\\newFolder3");
		//List the files in a folder --> gives control on the files inside the folder
		
		File[] fileNames = folder.listFiles();
		for(File file: fileNames) {
			try {
				Thread.sleep(3000);
				file.delete();
				System.out.println(file.getName()+"has been deleted");
			} catch (InterruptedException e) {
				e.getMessage();
			}

		}	
			folder.delete();
			System.out.println("Folder and Files inside are deleted");
			
			
		
		
	}

}
