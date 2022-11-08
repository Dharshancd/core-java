package com.dharshan.array;

public class SimbleRunner {

	public static void main(String[] args) {
		
		SimbleRunner a=new SimbleRunner();
		String name = "Dharshan";
		System.out.println("");
		a.printMessage("Pavan", 30);
		a.printMessage("Dharshan", 28);
		
	   a.simblePrintter(8,8);
	}
	
	private void printMessage(String name, int age) {
		System.out.printf("Hi %s, Your age is %d\n", name, age);
	}
	
	public  void simblePrintter(int x,int y) {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
		System.out.print("- ");
	
		
		}
			System.out.println();
		
		}
	}
}
	
	