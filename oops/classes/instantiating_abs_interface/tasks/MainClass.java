package oops.classes.instantiating_abs_interface.tasks;

public class MainClass {

	public static void main(String[] args) {
				
				BikeLicense me = new BikeLicense() {
					
					// Anonymous inner class
					
					@Override
					public void payFee() {
						System.out.println("Fee Paid");
						
					}
					
					@Override
					public void driveTest() {
						System.out.println("Drive test completed");
					}
					
					@Override
					public void applyLLR() {
						System.out.println("LLR application done");
					}
				};
				
		
				me.applyLLR();
				me.driveTest();
				me.payFee();
				
	}

}
