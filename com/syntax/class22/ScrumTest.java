package com.syntax.class22;

public class ScrumTest {
	
	public static void main(String[] args) {
		
		ScrumTeam a = new ScrumTeam();
		ScrumTeam.companyName="Facebook";
		a.fullName = "John Doe";
		a.salary = 100000.00;
//		a.ssn= //not available
		a.getPaid();
		a.work();
		
		a.attendMeetings();
		a.ceremonies = "Scrum meetings";
		a.workBuildingSoft();
		
		ProductOwner b = new ProductOwner();
//		ProductOwner.companyName have an access TOO
		b.salary = 70000.00;
		b.getPaid();
		b.work();
		
		b.ceremonies = "Scrum meetings";
		b.attendMeetings();
		b.workBuildingSoft();
		
		b.communicate();
		
	}

}
