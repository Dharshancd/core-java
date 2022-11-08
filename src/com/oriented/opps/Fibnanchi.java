package com.oriented.opps;

public class Fibnanchi {
	public static void main(String[] args) {
		fibnachi(4);

	}

	public static void fibnachi(int n) {
		
	    	if(n==1) {
	    		System.out.println(0);
	} if (n>=2) {
		System.out.println(0);
		System.out.println(1);
	}
	    
	int x = 0;
	int y = 1;
	
	for(int i=3; i<=n; i++) {
		
	int temp = x+y;	 
		x=y;
		y=temp;
		System.out.println(temp);
		
		

		
		
	}
	
	
	    	
	    }

}
