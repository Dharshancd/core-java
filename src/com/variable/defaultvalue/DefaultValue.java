package com.variable.defaultvalue;

public class DefaultValue {
	private int a;
	static int b;
	public static void main(String[] args) {
		DefaultValue dv = new DefaultValue();
		dv.test();
	}
	
	public void test() {
		int c = 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
