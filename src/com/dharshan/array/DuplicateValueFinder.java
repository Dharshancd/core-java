package com.dharshan.array;

public class DuplicateValueFinder {

	public static void main(String[] args) {
		int[]ary= {22,22,55,55,55 ,66,55,33,22,33};
	
		DuplicateValueFinder b = new DuplicateValueFinder();
		 b.duplicateWritter(ary);
																																																																																																				}

	public void duplicateWritter(int[]ary) {
		for (int i=0;i<ary.length;i++) {
			for (int j=i+1;j<ary.length;j++) {	
		   if((ary[i]==ary[j])&&(i != j)) {
			   System.out.print( ary[j]+" " ); 
		       }
		   
	        }
			
		 }
		
	  }
  }
