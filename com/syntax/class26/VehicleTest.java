package com.syntax.class26;

public class VehicleTest {
	public static void main(String[] args) {
		
		Vehicle lambo=new Lamborgini("12A34D5F678G");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);
		
		Car car=new Lamborgini("sds14p837s");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();
		
		total=Car.getTotal();
		System.out.println(total);
	}
}
