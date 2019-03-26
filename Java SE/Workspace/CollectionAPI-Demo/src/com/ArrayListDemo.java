package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();
		int[] nos = { 210, 324 };
		// add object
		ar.add(new Integer(123));
		ar.add(nos);
		ar.add("Abc");
		ar.add('A');
		ar.add(764.45f);
		ar.add(7474.45);
		ar.add(false);
		ar.add(new Object());
		ar.add(0, 7777);

		// display collection data as collection
		System.out.println(ar);

		// Find element from array list

		Object value = ar.get(3);
		System.out.println(value);

		// Update Ar data

		ar.set(3, "Xyz");

		System.out.println(ar);

		// remove object
		ar.remove(3);

		System.out.println(ar);
	}

}
