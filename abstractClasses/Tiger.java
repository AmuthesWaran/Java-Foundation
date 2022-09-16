package abstractClasses;

public class Tiger extends Animal {

	@Override
	public void eat() {
			System.out.println("Tiger eats meat");
	}

	@Override
	public void sleep() {
			System.out.println("Tiger sleeps for 13 hrs");
		
	}

	@Override
	public void run() {
		System.out.println("Tiger runs very fast");
	}

}

