package com.oriented.opps;

public class Bike {
	public static void main(String[] args) {
		Bike dukati = new Bike();
		Bike honda = new Bike();
		
		dukati.start();
		honda.start();
	}

		public void start() {
			System.out.println("Bike Not Started");
	}
}
