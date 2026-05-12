package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SalesPerformance;

public class ProgramSales {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SalesPerformance salesPerformance = new SalesPerformance();
		
		System.out.println("Nome: ");
		salesPerformance.name = sc.nextLine();
		
		System.out.println("Enter months value: ");
		salesPerformance.month1 = sc.nextDouble();
		salesPerformance.month2 = sc.nextDouble();
		salesPerformance.month3 = sc.nextDouble();
		
		if(salesPerformance.totalSales() > 60000) {
			System.out.println("Nome: " + salesPerformance.name);
			System.out.println("Meses: " + salesPerformance.month1 + " , " + salesPerformance.month2 + " , " + salesPerformance.month3);
			System.out.print("Total Sales: " + salesPerformance.totalSales() + " | " + "Status: Goal Reached");
		}else {
			System.out.println("Nome: " + salesPerformance.name);
			System.out.println("Meses: " + salesPerformance.month1 + " , " + salesPerformance.month2 + " , " + salesPerformance.month3);
			System.out.print("Total Sales: " + salesPerformance.totalSales() + " | " + "Status: Failed" + " | " +  "Missing: " + salesPerformance.remainingToGoal());
		}
		
		sc.close();
		
	}

}
