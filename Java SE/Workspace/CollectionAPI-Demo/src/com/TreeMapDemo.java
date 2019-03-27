package com;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<String, Object> hm = new TreeMap<>();
		hm.put("age", "86");
		hm.put("desig", "Trainer");
		hm.put("phno", 845845485);
		hm.put("name", "Praveen");
		hm.put("city", "Hyderabad");
		hm.put("city", "Goa");
		hm.put("k1", "Key Value");

		System.out.println(hm);

	}

}
