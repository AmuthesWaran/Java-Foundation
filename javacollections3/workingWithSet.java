package javacollections3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class workingWithSet {

	public static void addToSet(Set<Integer> set, String type) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<10; i++) {
			int random = (int)(Math.random()*10);
			set.add(random);
		}
		displaySet(set, type);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken for "+type+" is: "+(endTime-startTime));
	}
	
	public static void displaySet(Set<Integer> set, String type) {
		System.out.println("Set Type: "+type);
		
		for(Integer value: set) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
//		HashSet implementation
		HashSet<Integer> hashSet = new HashSet<>();
		addToSet(hashSet, "Hash Set");
		
//		LinkedHashSet implementation
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		addToSet(linkedHashSet, "Linked Hash Set");

//		TreeSet implementation
		TreeSet<Integer> treeSet = new TreeSet<>();
		addToSet(treeSet, "Treeset");
	}
}
