package syntax.groupproject01;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car sedan = new Sedan();
		System.out.println(sedan.calculateSalePrice(25, 300.00));
		
		Car truck = new Truck();
		System.out.println(truck.calculateSalePrice(2500, 1000.00));
	}

}
