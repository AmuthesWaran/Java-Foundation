package fileHandling_serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassThatDeSerializes {
	public static void main(String[] args) {

	ObjectInputStream ois = null;
	String path = "C:\\Users\\amuth\\Downloads\\myobj.bin";
	try {
		FileInputStream fis = new FileInputStream(path);
		ois = new ObjectInputStream(fis);
		Student student = (Student)ois.readObject();
		System.out.println("Student id:" + student.getSid());
		System.out.println("Student name:" + student.getsName());
		
		
		
	} catch (IOException | ClassNotFoundException e) {
		System.out.println(e.getMessage());
		
	}
	
	finally {
		try {
			ois.close();
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
		
		
	}

}
