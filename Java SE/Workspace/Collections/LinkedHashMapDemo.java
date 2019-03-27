package com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {

		LinkedHashMap<String, Object> hm = new LinkedHashMap<>();
		hm.put("age", "86");
		hm.put("desig", "Trainer");
		hm.put("phno", 845845485);
		hm.put("name", "Praveen");
		hm.put("city", "Hyderabad");
		hm.put("city", "Goa");
		
		System.out.println(hm);
		
		// find object
		
		System.out.println(hm.get("name"));
		System.out.println(hm.get("age"));
		
		// deleteing entry
		hm.remove("phno");
		System.out.println(hm);
		
		// replace new value using key
		hm.replace("name", "James");
		System.out.println(hm);
		
		// Convert Map into Set
		
		Set<Entry<String, Object>> setData=hm.entrySet();
		
		System.out.println(setData);
		
		// copy only keys to set
		
		Set<String> keys=hm.keySet();
		
		System.out.println(keys);
		
		for(String key:keys) {
			System.out.println(key+" ->"+hm.get(key));
		}
		
		
		

	}

}
