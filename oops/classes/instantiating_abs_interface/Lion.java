package oops.classes.instantiating_abs_interface;

public class Lion extends Animal {

	@Override
	public void eat() {
				System.out.println("Lion eats Meat");
	}

	@Override
	public void sleep() {
				System.out.println("Lion Slept");
	}
			
	
	public void die() 
				{
					System.out.println("Lion has died");
				}
	
}
