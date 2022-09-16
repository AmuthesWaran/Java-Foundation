package java8Features.functionalInterface.extn;

public class Citizen implements BikeLicense, CarLicence {

	@Override
	public void visitRtoOffice() {
			System.out.println("Visited RTO Office");
	}

	@Override
	public void applyForLLR() {
		// TODO Auto-generated method stub
		BikeLicense.super.applyForLLR();
		CarLicence.super.applyForLLR();
		
	}
	
	
	
	
	



//	@Override
//	public int visitRtoOffice(String location) {
//		System.out.println("visited RTO office");	
//		return 0;
//	}
//
//	@Override
//	public void visitRtoOffice() {
//		System.out.println("visited RTO office for License");
//	}

	


//	@Override
//	public void visitRtoOffice() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	

}
