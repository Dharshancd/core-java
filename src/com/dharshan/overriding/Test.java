package com.dharshan.overriding;

public class Test {
 public static void main(String[] args) {
	
	 Super sup = new Super();
	 sup.m1();
	 
	 Sub sub = new Sub();
	 sub.m1();
	 sub.m3();
	 
	 Super supSub = new Sub();
	 supSub.m1();
	 supSub.m2();
	 
	 
	 
	 //Not valid
//	 Sub subSup = new Super();
}
}
