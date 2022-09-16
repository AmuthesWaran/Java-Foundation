package oops.polymorphism.dynamic;

public class Manager extends Employee {

	Manager(String msg)
	{
		super();
		System.out.println("parameterized constructor child");
	}
	
	
	Manager()
			{		
				System.out.println("default parameter - child");
			}
		
	
	@Override
	public void work()
	{
		System.out.println("Manager manages ppl");
	}

	@Override
	public void sal()
	{
		super.sal();
		System.out.println("Manager Gets Paid");
	}

	
}
