package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatricImpl;
import com.pricematrix.PriceMatrix;

public class Test {

	public static void main(String[] args) {

		String cart1[] = { "Item01", "Item002" };
		String cart2[] = { "I004", "I005", "I006" };

		PriceMatrix price=new PriceMatricImpl(); // dependency obj
		
		
		//--------------------------------------
		BillingImpl biller = new BillingImpl(); // dependent object
		biller.setPrice(price); // DI -> Injecting Dependency 'price' to the dependent 'biller'
		//---------------------------------------
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 total: " + total);

	}

}
