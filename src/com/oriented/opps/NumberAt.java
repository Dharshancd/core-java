package com.oriented.opps;

public class NumberAt {

	public static void main(String[] args) {
	
		int i=indexAt("dharshan", 'd');
		
		System.out.println(i);
	   
	}
	
    public static int indexAt(String s, char c) {
    	int i =0;
    	while (s.charAt(i)!=c) {
    		if(i == s.length() - 1) {
    			return -1;
    		}
    		i++;
       }
   return i;
    }
}
