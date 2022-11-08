package com.dharshan.array;

public class AverageCalculator {
	
public static void main(String[] args) {
		int [] arr = {22,31,28,41,20,};
	    AverageCalculator s = new AverageCalculator();
	    int a = s.average(arr);
		System.out.println(a);
		
		
	}

	public int average(int[]arr) {
		int sum=0;
		int avg=0;
		for(int i:arr) {
			sum+=i;
			avg =sum/arr.length;
		}
	return avg;
	
	}
	

}
