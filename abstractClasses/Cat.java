package abstractClasses;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Cat eats Fish");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeps for 8 hrs");
	}

	@Override
	public void run() {
		System.out.println("Cat jumps runs faster");
		
	}

}
