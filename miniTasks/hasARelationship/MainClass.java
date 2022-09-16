package miniTasks.hasARelationship;

// has a relationship

public class MainClass {

	public static void main(String[] args) {
			
			OperatingSystem win11 = new OperatingSystem("Windows 11");
			
			PC newPC = new PC(win11, "i7", "4TB");
			
			System.out.println(newPC.oS.typeOs);
			System.out.println(newPC.processor);
			System.out.println(newPC.hardDiskSize);
			
			
		
		
	}

}
