package com;

public class GenDemo_V1<E> {
	/*
	 * generics
	 * 
	 */
	
	void f1(E element) {
		System.out.println(element);
		System.out.println(element.getClass().getTypeName());
	}

	public static void main(String[] args) {

		GenDemo_V1<Object> g = new GenDemo_V1<>();
		g.f1("Abc");
	
		
		

		// g.f1(100);
		// System.out.println(Integer.MAX_VALUE);

	}

}
