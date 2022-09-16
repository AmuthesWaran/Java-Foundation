package abstractClasses;

public abstract class Animal {
	
	public abstract void eat(); 
	public abstract void sleep();
	public abstract void run(); 
	
	public void die()
			{
				System.out.println("Animal die  when it become old");
			}

}
