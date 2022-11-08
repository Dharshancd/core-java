package com.oriented.opps;

public class Fib2 {
	public static void main(String [] args) {
     fib2(5);	
	}
	
	public static void fib2(int n) {
		if(n>0) {
			System.out.println(0);
		}else if (n>=1) {
		System.out.println(1);
	}
	int x=0;
	int y=1;
	
	for (int i=3; i<=n; i++) {
		int temp = x+y;
	    x=y;
	    y=temp;
	    	System.out.println(temp);
	    }
	    
	    
	}
	
}
