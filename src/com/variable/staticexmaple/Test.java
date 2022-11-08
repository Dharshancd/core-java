package com.variable.staticexmaple;


public class Test{
	public static void main(String[] args) {
		Employee e1 = new Employee("Pavan", 1);
		Employee e2 = new Employee("Dharshan", 2);
		
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		e1.setName("Yeshaswini");
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		
		System.out.println(e1.getSchool());
		System.out.println(e2.getSchool());
		
		Employee.setSchool("Junior School");
		

		System.out.println(e1.getSchool());
		System.out.println(e2.getSchool());
		
		
	}
	
}


class Employee {
	
	private String name;
	private int id;
	private static String school = "St. Joseph's School";
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Employee.school = school;
	}
	
	

}




