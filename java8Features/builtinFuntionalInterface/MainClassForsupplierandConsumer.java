package java8Features.builtinFuntionalInterface;

import java.util.function.Consumer;
import java.util.function.Supplier;


public class MainClassForsupplierandConsumer {

	public static void main(String[] args) {
			
		
		Supplier<Integer> supplier = ()-> (int)(Math.random()*1000);	
		
		Consumer<Integer> consumer = (val) -> System.out.println(val);
		
		
//		for (int i = 0; i < 100000; i++) 
//		{
		
		for (; ; )
		{
			int random = supplier.get();
//			System.out.println(random);
			consumer.accept(random);
			if(random==1) 
			{
				break;
			}
		
		}

}


}	
	