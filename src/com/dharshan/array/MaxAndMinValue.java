package com.dharshan.array;

public class MaxAndMinValue {

	public static void main(String[] args) {
	int[]ary= {88,85,96,91,95,};
	MaxAndMinValue a = new MaxAndMinValue();
	int v=a.maxValueFinder(ary);
      System.out.println(v);
      
      int u=a.minValueFinder(ary);
      System.out.println(u);
      
	}
	
	public int maxValueFinder(int[]ary) {
		int max=ary[0];
		for (int i=0; i<ary.length;i++) {
			if(ary[i]>max){
			max=ary[i];
	        }
		
	   }
		return max;
    } 

	public int minValueFinder(int[]ary) {
		int min=Integer.MAX_VALUE;
		for(int j:ary) {
			if(j<min) {
				min=j;
			}
		}
		return min;
	}
						
	}
	



