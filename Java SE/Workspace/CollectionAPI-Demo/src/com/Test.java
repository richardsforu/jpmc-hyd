package com;

import java.util.Arrays;

public class Test {
	
	/*
	 * 
	 * Linked List
	 * 1. Single LL
	 * 2. Double LL
	 * 
	 * In Collection API, LinkedList follows DoubleLinkedList class
	 * 
	 * E1 -> 10
	 * E2 -> 20
	 * E3 -> 30
	 * E4 -> 40
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int[] nos= {65,54,23,1,43,12,22,3};
		
		Arrays.sort(nos);
		for(int no:nos) {
			System.out.println(no);
		}
		System.out.println(Arrays.binarySearch(nos, 12));
		
		
		
		
	}

}
