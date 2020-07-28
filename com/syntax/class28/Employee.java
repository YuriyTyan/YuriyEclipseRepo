package com.syntax.class28;

public class Employee {
	
	public String fullName, title;
	
	
	//make variables as private
	private double salary;
	private int age, empID;
	
	public Employee(String fullName, String title) {
		this.fullName=fullName;
		this.title=title;
	}
	
	//create public methods (getters and setters) to give access to private variables
	
	//creating getters 
	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	//creating setters
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public void setAge(int age) {
		if(age>16) {
			this.age=age;
		}
	}
	
	public void setEmpID(int empID) {
		if(empID>0) {
			this.empID=empID;
		}
	}
}
