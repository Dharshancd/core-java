package com.oriented.opps;

public class ReverseName {

	public static void main(String[] args) {
		ReverseName r = new ReverseName();
		String s = "Pavan";
		int i = 2;
		r.reverseName(s);
		String ss = "Dharshan";
//		r.reverseName(ss);
//		System.out.print();
		
	}

public void reverseName(String s) {
	String ss = "";
	for (int i=s.length()-1; i>=0; i--) {
	ss = ss.concat(String.valueOf(s.charAt(i)));//pavan
}
	System.out.println("Done");
	
	
	
	
}
}