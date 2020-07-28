package syntax.groupproject01;

public class Car {

	double carPrice;
	String color;

	public double calculateSalePrice(int length, double carPrice) {
		return carPrice;
	}
}

class Sedan extends Car {
	int length;

	public double calculateSalePrice(int length, double carPrice) {
		this.length = length;
		super.carPrice = carPrice;
		if (length > 20) {
			return carPrice = carPrice * 0.05;
		}
		return carPrice = carPrice * 0.01;
	}
}

class Truck extends Car {
	int weight;

	public double calculateSalePrice(int weight, double carPrice) {
		this.weight = weight;
		super.carPrice = carPrice;
		if (weight > 2000) {
			return carPrice = carPrice * 0.1;
		}
		return carPrice = carPrice * 0.2;
	}
}