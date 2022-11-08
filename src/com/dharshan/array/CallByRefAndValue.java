package com.dharshan.array;

public class CallByRefAndValue {

	public static void main(String[] args) {
		CallByRefAndValue v = new CallByRefAndValue();
		int i = 10; double d = 10.0;
		v.primitiveCall(i, d);
		
//		System.out.println(i);
//		System.out.println(d);
		
		int[] arr = {1, 2, 3, 4};
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		v.referenceCall(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	
	
	private void primitiveCall(int a, double b) {
		a = 20;
		b = 20.0;
	}
	
	private void referenceCall(int[] a) {
		a
		[0] = 10;
	}
}
