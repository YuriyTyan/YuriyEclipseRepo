package syntax.groupproject01;

public abstract class Marks {

	abstract double getPercentage();
}

class A extends Marks {

	int math, hist, geo;

	A(int math, int hist, int geo) {
		this.math = math;
		this.hist = hist;
		this.geo = geo;
	}

	@Override
	public double getPercentage() {
		return ((this.math + this.hist + this.geo) * 100) / 3;
	}
}

class B extends Marks {

	int math, hist, geo, chem;

	B(int math, int hist, int geo, int chem) {
		this.math = math;
		this.hist = hist;
		this.geo = geo;
		this.chem = chem;

	}

	double getPercentage(int math, int hist, int geo, int chem) {
		
		return 0;
	}

}