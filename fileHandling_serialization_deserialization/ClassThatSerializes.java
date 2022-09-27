package fileHandling_serialization_deserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ClassThatSerializes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		Student hey = new Student();
		System.out.println("input Student id and name: ");
		hey.setSid(s.nextInt());
		hey.setsName(s.next());
		ObjectOutputStream oos = null;
		
//		hey.setSid(176);
//		hey.setsName(null);
		
		
		
		String path = "C:\\Users\\amuth\\Downloads\\myobj.bin";
		
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			System.out.println("Bin file opened...");
			
			oos = new ObjectOutputStream(fos);
			oos.writeObject(hey);
			System.out.println("bahrathy's info has been preserved");
		} catch (IOException e) {
			 System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		
		finally {
			
			try {
				oos.close();
				System.out.println("File Closed");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
