package interfaces_eg;

public class CitiznWithbothLicense implements BikeLicense, CarLicense {

	@Override
	public void applyCarLLR() {
		System.out.println("Has LLR for Car");
		
	}

	@Override
	public void payCarLicenseFee() {
		System.out.println("Has Paid license for Car");		
	}

	@Override
	public void carDriveTest() {
			System.out.println("Has completed car drive test");
	}

	@Override
	public void applyBikeLLR() {
			System.out.println("Has LLR for Bike");
	}

	@Override
	public void payBikeLicenseFee() {
			System.out.println("Has paid license for bike");
	}

	@Override
	public void bikeDriveTest() {
			System.out.println("has completed bike drive test");
		
	}
			
}
