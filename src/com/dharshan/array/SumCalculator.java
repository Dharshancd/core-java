package com.dharshan.array;

public class SumCalculator {

	public static void main(String[] args) {
		int [] arr = {22,31,28,41,20};
	    SumCalculator s = new SumCalculator();
		int a = s.sumCalcul(arr);
		System.out.println(a);
}

	public int sumCalcul(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
	return sum;
	}
	
}
