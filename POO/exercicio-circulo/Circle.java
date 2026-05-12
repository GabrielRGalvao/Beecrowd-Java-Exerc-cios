package entities;

public class Circle {
	
	public double radius;
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double circunferencia() {
		return 2 * Math.PI * radius;
	}
	
}
