package bola;

public class Circulo {
	public Circulo(double radius) {
		this.radius = radius;
	}

	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}