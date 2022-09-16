package java8Features.lamda_expression;

public class LamdaTest {

	public static void main(String[] args) {
//Usual Method
//		FunctionalInterface obj = new FunctionalInterface() {
//					
//					@Override
//					public void printMessage(String message) {
//					System.out.println(message);
//						
//					}
//				};
		
//Lamda Expression		
//		FunctionalInterface obj = (String message) -> {
//			System.out.println(message);
//		};

//Lamda Expression more simplified
		FunctionalInterface obj = ( message) -> System.out.println(message);
		
		FunctionalInterface2 obj2 = message -> message.length();
		
		FunctionalInterface2 obj3 = new FunctionalInterface2() {
			
			@Override
			public int getNameLength(String message) {
			return message.length();
				
			}
		};
	
		
	obj.printMessage("hey!");
	System.out.println(obj2.getNameLength("Hello"));
	
	
	
	}

}
