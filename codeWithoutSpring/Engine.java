package codeWithoutSpring;

public class Engine {
	
	private int engineNo;
	private String engineName;
	private int noOfVolves;
	private int noOfPistons;
	
	public Engine() {
		super();
	}

	public Engine(int engineNo, String engineName, int noOfVolves, int noOfPistons) {
		super();
		this.engineNo = engineNo;
		this.engineName = engineName;
		this.noOfVolves = noOfVolves;
		this.noOfPistons = noOfPistons;
	}
	
	public void displayEngineDetails() {
		System.out.println("Engine no: "+engineNo);
		System.out.println("Engine name: "+engineName);
		System.out.println("Volves: "+noOfVolves);
		System.out.println("Piston: "+noOfPistons);
	}
	
	
	
	
}
