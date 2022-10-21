package understandingSingleton;

public class Mentor {

		// By making the static object there will be only one copy maintained but made private so that
		// Security is maintained
	
	private static Mentor mentor = new Mentor();
	
	private static Mentor mentor2 = new Mentor();
	
	
	// by making the constructor private none from outside can create object for the class Mentor
	private Mentor() {}
	
	//by making the getInstance() method static we share the only copy of object to the outsider
	public static Mentor getInstance() {
		return mentor;
	}
	
	public static Mentor getInstance2() {
		return mentor2;
	}
	
	public void sayHello() {
		System.out.println("Hello world");
	}
	
}
