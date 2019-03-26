package com;

public class CricketScore<K, V> {

	void saveScope(K key, V value) {

		System.out.println("Player " + key + " made " + value + " Runs");

	}

	public static void main(String[] args) {

		CricketScore<String, Integer> p1 = new CricketScore<>();
		CricketScore<String, Integer> p2 = new CricketScore<>();
		CricketScore<String, Integer> p3 = new CricketScore<>();

		p1.saveScope("Abc", 988);
		p2.saveScope("Xyz", 344);
		p3.saveScope("Abd", 3777);
		
		

	}

}
