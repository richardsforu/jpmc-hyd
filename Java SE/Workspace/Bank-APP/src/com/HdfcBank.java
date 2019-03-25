package com;

public class HdfcBank implements BankEmployee, Customer, Manager, Cleark {

	@Override
	public void openAccount() {
		System.out.println("-- Opening Account");

	}

	@Override
	public void closeAccount() {
		System.out.println("-- Closing Account");
	}

	@Override
	public void withDraw() {
		System.out.println("-- WIthDrawing");

	}

	@Override
	public void deposit() {
		System.out.println("--- Depositing");

	}

	@Override
	public void lockerAccess() {
		System.out.println("---- Locker access is gievn");

	}

	@Override
	public void clearkOperations() {
		System.out.println("--- Clearkal operations");

	}

}
