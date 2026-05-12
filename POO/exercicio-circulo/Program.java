package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Circle circ = new Circle();
		circ.radius = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", circ.area());
		System.out.printf("CIRCUNFERENCIA = %.2f%n", circ.circunferencia());
		
		sc.close();
		
		
	}

}
