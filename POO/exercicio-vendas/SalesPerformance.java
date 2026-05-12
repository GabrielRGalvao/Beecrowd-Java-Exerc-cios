package entities;

public class SalesPerformance {
	
	public String name;
	public double month1, month2, month3;
	
	public double totalSales(){
		return month1 + month2 + month3;
	}
	
	public double remainingToGoal() {
		return 60000 - totalSales();
	}
}
