package com.dharshan.array;

public class CopyByItrating {

	public static void main(String[] args) {
		int[]arr= {22,7,51,76,47,88};
   CopyByItrating n= new CopyByItrating();
         //n.copyOfArray(arr);
   
         n.reverseAnArray(arr);
         
	}
	
public void copyOfArray(int[]arr) {
	for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
       }
    }
public void reverseAnArray(int[]arr) {
	for (int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]+" ");
       }
    }
}
