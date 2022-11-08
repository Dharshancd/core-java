package com.opps.inheritence;

public class Animal {
	
	protected int weight;
	
	public int  abc() {
		walk();
		weight = weight+1;
		if(weight < 0) {
			return 1;	
		}
		
		return weight;
	}
	
	protected void walk() {
		System.out.println("walking");
	}
	
	protected void eat() {
		System.out.println("eating");
	}

}
