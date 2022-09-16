package javacollections3;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorkingWithMaps {

	public static void main(String[] args) {
			
		//HashMap
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(110, "User 0");
		hashMap.put(121, "User 1");
		hashMap.put(129, "User 2");
		hashMap.put(126, "User 3");
		hashMap.put(124, "User 4");

		System.out.println(hashMap);
		
		//LinkedHashMap
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(110, "User 0");
		linkedHashMap.put(121, "User 1");
		linkedHashMap.put(129, "User 2");
		linkedHashMap.put(126, "User 3");
		linkedHashMap.put(128, "User 4");

		
		System.out.println(linkedHashMap);
		
		//TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(110, "User 0");
		treeMap.put(121, "User 1");
		treeMap.put(129, "User 2");
		treeMap.put(126, "User 3");
		treeMap.put(128, "User 4");
		
		System.out.println(treeMap);
		
		//Getting a particular element from the map
		System.out.println(treeMap.get(100));
		System.out.println(linkedHashMap.get(121));
		
		//Getting all the keys in a map
		Set<Integer> keys = treeMap.keySet();
		System.out.println(keys);
		
		//Getting all the values in a map
		Collection<String> values = treeMap.values();
		System.out.println(values);
		
		for(Map.Entry<Integer, String> m: treeMap.entrySet()) {
			System.out.println(m );
			System.out.println(m.getKey() );
			System.out.println(m.getValue());
		}
		
		System.out.println();
		
		for(Map.Entry<Integer, String> m: hashMap.entrySet()) {
			System.out.println(m );
		}
		
		System.out.println();
		
		for(Map.Entry<Integer, String> m: linkedHashMap.entrySet()) {
			System.out.println(m );
		}
		
		
		
	}

}
