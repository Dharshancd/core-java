package com.dharshan.array;

public class ArraySort {

	public static void main(String[] args) {
	int [] arr = {22,31,28,41,20};
	ArraySort s = new ArraySort();
	s.sortingNumber(arr);
	for (int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);

	  }
	}
	public void sortingNumber(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
	}
	
}
