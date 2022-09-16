package oops.classes.instantiating_abs_interface;

public class MainClass {

	public static void main(String[] args) {
					
			Lion lion = new Lion();   // declaration can be accessed - less secured - ctrl + click on Lion
			
			Animal lion2 = new Lion(); // declaration still can be accessed but here animal is abstract 
			
			lion.eat();
			lion.sleep();
			lion.die(); 
			
			lion2.eat();
			lion2.sleep();
			lion2.die();
			
			
			Animal elephant = new Animal() 
			
					// Anonymous inner class
					
					// Animal is not implemented since it is an abstract class
					// Hence we are implementing below as anonymous inner class
					
			
				{

					@Override
					public void eat() {
							System.out.println("Elephant eats a lot");
					}

					@Override
					public void sleep() {
						System.out.println("Elephant slept");
					}
					
				};
			
				elephant.eat();
				elephant.sleep();
				elephant.die();
			
			
				Lion babyLion = new Lion()
						{
					public void weep() 
							{
								System.out.println("Baby Lion Cry");
							}
					
						};
			
			
			
			
			
		
	}

}
