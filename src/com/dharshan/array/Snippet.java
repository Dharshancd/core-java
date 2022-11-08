package com.dharshan.array;



public class Snippet {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		System.out.println(a.getClass().getName());
		
		Employee e = new Employee(1);
		System.out.println(e);
		Employee e1 = new Employee(2);
		System.out.println(e1);
	}
	
	
	
}

//com.dharshan.array.Employee@12edcd21
//com.dharshan.array.Employee@12edcd21
class Employee {
	
	int id;
	
	public Employee(int id) {
		this.id = id;
	}
	
}