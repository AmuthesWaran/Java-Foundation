package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		Iterator<Integer> itr = al.iterator();
		
//		System.out.println(itr);
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
