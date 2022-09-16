package java8Features;


@FunctionalInterface
public interface FunctionalInterfaceExample1 {
	// functional interface
	 void test();
	
	 public default void defaultMethod() {
		 System.out.println("default method");
	 }
	 
	 public static void staticMethod() {
		System.out.println("static method"); 
	 }
	
}
