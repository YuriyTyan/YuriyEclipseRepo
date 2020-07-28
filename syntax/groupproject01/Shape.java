package syntax.groupproject01;

public interface Shape {
	
	void calculateArea(int radius);
	void calculatePerimeter(int radius);
}

class Circle implements Shape{
	int radius;
	int length;

	@Override
	public void calculateArea(int radius) {
		this.radius=radius;
		System.out.println("Area of circle is: "+this.radius*this.radius*3.14);
	}
	
	@Override
	public void calculatePerimeter(int length) {
		this.radius=radius;
		System.out.println("Perimeter circle is: "+2*3.14*this.radius);
	}
}

class Square implements Shape {
	
	int num;
	int radius;
	
	@Override
	public void calculateArea(int length) {
		this.radius=radius;
		System.out.println("Area of square is:"+radius*radius);
	}

	@Override
	public void calculatePerimeter(int num) {
		this.num=num;
		System.out.println("Perimeter of Square is "+num*4);
		
	}
	
}