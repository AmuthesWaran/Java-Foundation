package abstractClasses;

public class Lion extends Animal {

	@Override
	public void eat() {
			
			System.out.println("Lion eats Zebra");
			
	}

	@Override
	public void sleep() {
			System.out.println("Lion sleeps for 16 hours");
	}

	@Override
	public void run() {
		System.out.println("Lion runs Faster");
		
	}

}
