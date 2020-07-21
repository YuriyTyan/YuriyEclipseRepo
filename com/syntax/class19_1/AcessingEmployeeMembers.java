package com.syntax.class19_1;

import com.syntax.class19.Employee;

public class AcessingEmployeeMembers {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.lastName="Oliva";//accessing public variables within different package
		emp.lastName="Luis";//accessing public variables within different package
		
//		emp.age --> protected not visible within different package
//		emp.salary --> default not visible within different package
//		emp.ssn --> private not visible within different package
		emp.displayName();
		
	}
}
