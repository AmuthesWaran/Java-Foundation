package codeWithoutSpring;

public class Car {
	//Instance variables of car
	//Has a relationship
	//Composition relationship
	
	private Engine engine;
	private Tyre tyre;
	private String color;
	private String carBrandName;
	
	public Car(String color, String carBrandName, Engine engine, Tyre tyre) {
		super();
		this.engine = engine;
		this.tyre = tyre;
		this.color = color;
		this.carBrandName = carBrandName;
	}
	
	
	public void displayDetails() {
		System.out.println("Car Color: "+color);
		System.out.println("Car Brand: "+carBrandName);
		System.out.println("Engine details: ");
		engine.displayEngineDetails();
		System.out.println("Tyre Details: ");
		tyre.displayTypeDetails();
		
		
		
	}
	
	
	
	
}
