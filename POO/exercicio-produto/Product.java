package entities;

public class Product {
	
	public String name;
	public double grossPrice;
	public double tax;
	
	public double finalPrice() {
		return grossPrice - tax;
	}
	
	public void increasePrice(double percentage) {
		grossPrice += grossPrice * percentage / 100.00;
		
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", finalPrice());
		
	}
	
}
