package com.syntax.class28;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee("John Smith", "QA");
		emp.setSalary(90000);
		double salary=emp.getSalary();
		System.out.println(salary);
		
		emp.setAge(33);
		System.out.println(emp.getAge());
		
		emp.setEmpID(-120);
		System.out.println(emp.getEmpID());
		
	}

}
