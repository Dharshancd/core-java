package com.dharshan.array;

public class BubbleSort {
	public static void main(String[] args) {
		int arrray[] = {12, 8, 21, 9, 136, 6, 44};
		BubbleSort s = new BubbleSort();
		s.sort(arrray);
		for(int i=0;i<arrray.length;i++)
		System.out.println(arrray[i]);
	}
	
	
	
	private void sort(int[] arrry) {
		for (int i = 0; i < arrry.length; i++) {
			for (int j = i+1; j < arrry.length; j++) {
				if(arrry[i] > arrry[j]) {
					int temp = arrry[j];
					arrry[j] = arrry[i];
					arrry[i] = temp;
				}
			
	
			}
			
		}
	
	}
	
	}
