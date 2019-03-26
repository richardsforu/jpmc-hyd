package com;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args) {
		
		int[] nos= {65,54,23,1,43,12,22,3};
		
		Arrays.sort(nos);
		for(int no:nos) {
			System.out.println(no);
		}
		System.out.println(Arrays.binarySearch(nos, 12));
		
		
		
		
	}

}
