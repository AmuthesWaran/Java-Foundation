package java8Features;

public class MainClass {

	public static void main(String[] args) {
			
		FunctionalInterfaceExample1 obj = new FunctionalInterfaceExample1() {
			
			@Override
			public void test() {
					System.out.println("Abstract method implemented");
			}
			
			public void defaultMethod() {
				FunctionalInterfaceExample1.super.defaultMethod();
				System.out.println();
				
			}
			
			
//			public static void staticMethod()
//			{
//				staticMethod();
//				System.out.println("Static Method overridden");
//			}
//			
			
		};
		
		obj.defaultMethod();
		
		FunctionalInterfaceExample1.staticMethod();
		
			
	}

}
