package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();

		cities.add("Chennai");
		cities.add("Hyderabad");
		cities.add("Pune");
		cities.add("Delhi");
		cities.add("Mmbai");

		// Iterate or loop the data

		// 1. using for loop

		// System.out.println(cities);
		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));

		}

		System.out.println("---------------------------");

		// Display data in Reverse
		for (int i = cities.size() - 1; i >= 0; i--) {
			System.out.println(cities.get(i));
		}

		System.out.println("----------------------------");

		// 2. suing for each -> for each works only for arrays

		for (String city : cities) {

			System.out.println(city);

		}

		// --------------------------------
		// 3. Iterator interface

		/*
		 * 1. hasNext() -> gives true if record present 2. next() -> moves curser to
		 * next record 3. remove() -> removes presnet cursor positioned record
		 */

		System.out.println("_______________________________");
		Iterator<String> it = cities.iterator();

		while (it.hasNext()) {
			String cityName = it.next();
			if (cityName.equals("Pune")) {
				// cities.remove(cityName);
				it.remove();
				continue;
			}
			System.out.println(cityName);
		} // while loo end

		System.out.println(cities);
		// ----------------------------------------

		// 4. ListIterator
		/*
		 * 1. hasNext() 2. hasPrevious() 3. next(); 4. previous(); 5. remove(); 6.
		 * add();
		 */

		System.out.println("____________________________");

		ListIterator<String> li = cities.listIterator();

		while (li.hasNext()) {
			String city = li.next();
			if (city.equals("Delhi")) {
				li.set("N-Delhi"); // replaces
				li.add("New Delhi"); // new entry
			}
			System.out.println(city);
		}

//		System.out.println("--- Reverse ----");
//		
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}

		System.out.println(cities);

	}

}
