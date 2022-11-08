package com.dharshan.array;

public class IndexFinder {
	public static void main(String[] args) {
		int [] arr = {22,31,28,41,20,};
	    IndexFinder s = new IndexFinder();
		int b = s.valueContains(arr, 41);
		System.out.println(b);
		boolean c= s.valueIsPresent(arr, 41);
		System.out.println(c);
		s.reverseAnArray(arr);
		for (int i=arr.length-1;i<0;i--)
		System.out.println(arr[i]);
	}

	public int valueContains(int[]arr,int x) {
		int v=-1;
		for (int i=0;i<arr.length;i++) {
		if (arr[i]==x) {
		return i;
			}
        }
		return v;
		
	  }
	public boolean valueIsPresent(int[]arr,int x) {
		for (int i=0;i<arr.length;i++) {
		if (arr[i]==x) {
		return true;
			}
        }
		return false;
	}	

	public void reverseAnArray(int[]arr) {
		for (int i=arr.length-1;i<0;i--) {
			System.out.println(arr[i]);
				
			}
        }
		
	}	

	
