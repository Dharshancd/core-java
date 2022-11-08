package com.dharshan.encapsulation;

public class Test {
	public static void main(String[] args) {
		Employee e = new Employee(1, "Dharsan", 20);
		System.out.println(e.getAge());
		e.setAge(20);
		
		Employee e1 = new Employee();
		e1.setAge(20);
		e1.setId(2);
		e1.setName("pavan");
	}
}
