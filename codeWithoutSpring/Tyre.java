package codeWithoutSpring;

public class Tyre {
	
	private int tyreNo;
	private String tyreBrandName;
	private int psi;
	
	public Tyre() {
		super();
	}

	public Tyre(int tyreNo, String tyreBrandName, int psi) {
		super();
		this.tyreNo = tyreNo;
		this.tyreBrandName = tyreBrandName;
		this.psi = psi;
	}
	
	public void displayTypeDetails() {
		System.out.println("Tyre No: "+tyreNo);
		System.out.println("Tyre Brand Name "+tyreBrandName);
		System.out.println("PSI :"+psi);
	}
	
	
	
	
	
}
