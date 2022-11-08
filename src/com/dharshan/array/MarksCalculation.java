package com.dharshan.array;

public class MarksCalculation {
	public static void main(String[] args) {
		int[] marks= { 80, 88, 90, 92, 86 };
		MarksCalculation e = new MarksCalculation();
		
		int sum = e.sumOfMarks(marks); 
		System.out.println(sum);
		
		int n = e.marksIsPresentIndex(marks, 70); 
		System.out.println(n);
		
		
		
	}
	
public int sumOfMarks(int[] marks) {
	int sum=0;
	for(int i=0; i<marks.length; i++) {
		sum += marks[i];
		
	}
	return sum/marks.length;
	
	
	}


public boolean marksIsPresent(int[] marks, int a) {
	boolean b = false;
	for(int i=0; i<marks.length; i++) {
	if (a == marks[i]) {
		b = true;
	}
	}
	return b ;
	
}

public int marksIsPresentIndex(int[] marks, int a) {
	 int n=-1;
	for(int i=0; i<marks.length; i++) {
	if (a == marks[i]) {
	n=i;
	}
	}
	return n;
}
}













	
