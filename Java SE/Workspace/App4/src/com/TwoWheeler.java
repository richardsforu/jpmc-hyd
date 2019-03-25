package com;

public class TwoWheeler  extends Vehicle{
	
	// Method Over loading --> static / compile time polymorphism
	void f1() {}
	void f1(int x) {}
	void f1(String x) {}
	void f1(int x,int y) {}
	void f2(int y,String y1) {}
	
	// Dynamic Polymorphism / Runtime polymorphism
	// 1. Method Overriding
	
	@Override
	void bookVehicle() {
		System.out.println("--- TwoWheeler bookVehicle");
	}
	
	
	
	
}
