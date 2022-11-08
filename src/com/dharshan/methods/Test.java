package com.dharshan.methods;

class Test {
	long add(int a, int b) {
		return a+b;
	}

	double add(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		Test t = new Test();
		double r = t.add(1.1, 3);
		System.out.println(r);
	}
}