package com;

public class GenDemo {

	void f1(int x) {
		System.out.println("Int: " + x);
	}

	void f1(byte b) {
		System.out.println("Byte: " + b);
	}

	void f1(short s) {
		System.out.println("Short: " + s);
	}

	void f1(long l) {
		System.out.println("Long: " + l);
	}

	void f1(float f) {
		System.out.println("Float: " + f);
	}

	void f1(double d) {
		System.out.println("Double: " + d);
	}

	public static void main(String[] args) {
		
		GenDemo g=new GenDemo();
		
		g.f1(100);
		//System.out.println(Integer.MAX_VALUE);
		
		
		
		
		
		
		
		
		

	}

}
