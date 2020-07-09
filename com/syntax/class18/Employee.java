package com.syntax.class18;

public class Employee {
	
	int eID, salary;
	static String SEO = "Sumair";
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eID=12345;
		emp1.salary=12345;
		System.out.println("emp1 ID is "+emp1.eID+ " emp1 salary is "
		+emp1.salary+" and emp1 SEO is "+Employee.SEO);
		
		Employee emp2 = new Employee();
		emp2.eID=67890;
		emp2.salary=67890;
		System.out.println("emp2 ID is "+emp2.eID+ " emp2 salary is "
		+emp2.salary+" and emp2 SEO is "+Employee.SEO);
		
	}
	
	static void sayHellotoCeo() {
		System.out.println("Hi "+SEO);
	}

}
