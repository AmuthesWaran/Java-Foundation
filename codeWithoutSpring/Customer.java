package codeWithoutSpring;

public class Customer {

	public static void main(String[] args) {

		Engine engine = new Engine(13, "V8", 4, 6);
		Tyre tyre = new Tyre(512, "CEAT", 60);
		Car myCar = new Car("White", "Honda", engine, tyre);
	}

}
