package com;

public class Test {

	public static void main(String[] args) {
		
		BankEmployee be=new HdfcBank();
		//be.openAccount();
		
		Customer cust=new HdfcBank();
		
		Manager m=new HdfcBank();
		m.lockerAccess();
		
		Cleark c=new HdfcBank();
		
		

	}

}
