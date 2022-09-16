package javaCollection2;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistsort {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("E");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("D");
		
		Collections.sort(list);
		System.out.println(list);		
		
		//Sort in reverse natural order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);	
	}

}
