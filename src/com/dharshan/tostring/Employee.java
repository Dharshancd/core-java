package com.dharshan.tostring;

public class Employee {
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		int age = 20;
		return this.age;
	}
	public void setAge(int age) {
		if(age > 0 && age < 150) {
			this.age = age;	
		}
		
	}
	public Employee() {
	}
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public String toString() {
		return "name --> " + this.name + " age --> " + this.age + " id --> " + this.id;
	}
	
	
	
}
