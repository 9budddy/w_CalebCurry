package org.budddy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		HashMap<String, Integer> ids = new HashMap<String, Integer>();
		ids.put("Buddy Jones", 5);
		ids.put("Caleb Curry", 345);
		
		ids.put("Caleb Curry", ids.getOrDefault("Caleb Curry", 0) + 1);
		
		for(Entry<String, Integer> id : ids.entrySet()) {
			System.out.println(id.getKey());
			System.out.println(id.getValue());
		}
		
		Set<String> keys = ids.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(ids.get(key));
		}
		
	}
}
