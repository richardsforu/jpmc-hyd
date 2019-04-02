package com.bill;

import com.pricematrix.PriceMatricImpl;
import com.pricematrix.PriceMatrix;

//Dependent class
public class BillingImpl {
	/*
	 * Design Issues ------------------ -> Too many dependency class object
	 * creations -> per goes down -> memory issues
	 * 
	 * Why this issue happened? ----------------------------- -> Dependent class is
	 * creating dependency class object
	 * 
	 * What is the Solution? ------------------------ -> Do not create dependency
	 * class objects in the dependent class
	 * 
	 * -> Insted of creating, search or find the object using JNDI
	 * 
	 * -> JNDI location is tightly binded.
	 * 
	 * What is the best Solution? ------------------------- -> do not create, do not
	 * find. instead ask some one get get dependency object. IoC(Inversion of
	 * control)
	 * 
	 * -> DI (Dependency Injection) : Injecting Dependency to dependent -> In how
	 * many ways DI can be implemented? Two Ways 1. Using setter based injection 2.
	 * Using constructor based injection
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	private PriceMatrix price;

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}

	public double getCartTotal(String[] cart) {

		// PriceMatrix price = new PriceMatricImpl();
		double total = 0.0;

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
