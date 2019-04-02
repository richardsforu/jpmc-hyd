package com.pricematrix;

//Dependency
public class PriceMatricImpl implements PriceMatrix {
	
	public PriceMatricImpl() {
		System.out.println("---- PriceMatricxImpl object created..");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to connect to DB and fetch price of a given itemcode
		return 100.00;

	}

}
