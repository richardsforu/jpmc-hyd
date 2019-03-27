package com;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> hs = new LinkedHashSet<>();

		hs.add("Abc");
		hs.add("Praveen");
		hs.add(1234);
		hs.add('A');
		hs.add("Test");
		hs.add("Abc");
		hs.add(65.34f);

		System.out.println(hs);

		// find and display 1234 value from the hs

		boolean flag = false;

		for (Object obj : hs) {
			if (obj.equals(1234)) {
				flag = true;
			}
			// System.out.println(obj);

		} // loop

		if (flag == true) {
			System.out.println("data Found");
		} else {
			System.out.println("No data found");
		}

	}

}
