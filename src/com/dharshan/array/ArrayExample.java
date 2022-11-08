package com.dharshan.array;
public class ArrayExample {

	public static void main(String[] args) {
		int input[] = {1, 2, 6, 5};
		ArrayExample a = new ArrayExample();
		int[] squre = a.squre(input);
		for (int i = 0; i < squre.length; i++) {
			System.out.println(squre[i]);
		}

	}
	
	
	
	
	public int add(int[] x) {
		
		int temp = 0;
		
		for (int i = 0; i < x.length; i++) {
			temp += x[i];// temp = temp + x[i];
		}
		return temp;
	}
	
	private int max(int[] x) {
		if(x.length == 0) {
			return -1;
		}
		int min = x[0]; //{1, 5, 6, 3}
		for(int i = 1; i< x.length ; i++) {
			if(min > x[i]) {
				min = x[i];
			}
		}
		return min;
	}
	private int [] squre(int[] x) {
		
		for(int i = 0; i< x.length ; i++) {
			x[i] = -x[i];
			}
		
		return  x;
	
}
}
