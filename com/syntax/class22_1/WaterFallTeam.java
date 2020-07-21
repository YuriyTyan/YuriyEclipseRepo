package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterFallTeam extends Employee {
	
	public void doSlowWork() {
		System.out.println("do slow work");
	}
	
	public static void main(String[] args) {
		
		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.companyName="Instagram";
		wt.fullName="John Snow";//protected member is accessible to
		//different class through inheritance
		System.out.println(wt.fullName);
		
		Employee emp = new Employee();
		emp.getPaid();
		emp.work();
		emp.companyName = "Smart";
		
	}

}
